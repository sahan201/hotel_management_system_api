package com.project_hotel.hotel_api.services.impl;

import com.project_hotel.hotel_api.dto.request.RequestHotelDto;
import com.project_hotel.hotel_api.dto.response.ResponseBranchDto;
import com.project_hotel.hotel_api.dto.response.ResponseHotelDto;
import com.project_hotel.hotel_api.dto.response.paginate.HotelPaginateResponseDto;
import com.project_hotel.hotel_api.entity.Branch;
import com.project_hotel.hotel_api.entity.Hotel;
import com.project_hotel.hotel_api.exceptions.EntryNotFoundException;
import com.project_hotel.hotel_api.repo.HotelRepo;
import com.project_hotel.hotel_api.services.HotelService;
import com.project_hotel.hotel_api.utils.ByteCodeHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class HotelServiceImpl implements HotelService {

    private final HotelRepo hotelRepo;
    private final ByteCodeHandler byteCodeHandler;


    @Override
    public void create(RequestHotelDto Dto) {
        try{
            hotelRepo.save(toHotel(Dto));
        }catch (SQLException e){
            throw new RuntimeException(e);
        }

    }

    @Override
    public void update(RequestHotelDto Dto, String hotelId) throws SQLException {
        Hotel selectedHotel = hotelRepo.findById(hotelId).orElseThrow(()->new EntryNotFoundException("hotel not found !"));
        selectedHotel.setHotelName(Dto.getHotelName());
        selectedHotel.setUpdatedAt(LocalDateTime.now());
        selectedHotel.setDescription(byteCodeHandler.stringToBlob(Dto.getDescription()));
        selectedHotel.setStartingFrom(Dto.getStartingFrom());
        selectedHotel.setStarRating(Dto.getStarRating());
        hotelRepo.save(selectedHotel);
    }

    @Override
    public void delete(String hotelId) {
        hotelRepo.findById(hotelId).orElseThrow(()->new EntryNotFoundException("hotel not found !"));
        hotelRepo.deleteById(hotelId);
    }

    @Override
    public ResponseHotelDto findById(String hotelId) throws SQLException {
        Hotel selectedHotel = hotelRepo.findById(hotelId).orElseThrow(()->new EntryNotFoundException("hotel not found !"));
        return toResponseHotelDto(selectedHotel);
    }

    @Override
    public HotelPaginateResponseDto findAll(int page, int size, String searchText) throws SQLException {
        return HotelPaginateResponseDto.builder()
                .dataCount(hotelRepo.countAllHotels(searchText))
                .dataList(
                        hotelRepo.searchAllHotels(searchText, PageRequest.of(page, size))
                                .stream().map(e-> {
                                    try{
                                        return toResponseHotelDto(e);
                                    }catch (SQLException ex){
                                        throw new RuntimeException(ex);
                                    }
                                }).collect(Collectors.toList())
                )
                .build();
    }


    //mapping

    private Hotel toHotel(RequestHotelDto Dto)throws SQLException{  // Dto => Hotel
        //Dto is an object that created from RequestHotelDto class.
        //Hotel is a class type and toHotel is the name of the function
        return Dto == null?null:
                Hotel.builder()
                        .hotelName(Dto.getHotelName())
                        .hotelId(UUID.randomUUID().toString())
                        .starRating(Dto.getStarRating())
                        .description(byteCodeHandler.stringToBlob(Dto.getDescription()))
                        .createdAt(LocalDateTime.now())
                        .updatedAt(LocalDateTime.now())
                        .activeStatus(true)
                        .startingFrom(Dto.getStartingFrom())
                        .build();
    }

    private ResponseHotelDto toResponseHotelDto(Hotel hotel)throws SQLException{
        //database eke data response Dto ekak widihata convert krnwa 
        //Hotel = class, hotel = object
        return hotel == null?null:
                ResponseHotelDto.builder()

                        .hotelId(hotel.getHotelId())
                        .hotelName(hotel.getHotelName())
                        .activeStatus(hotel.isActiveStatus())
                        .startingFrom(hotel.getStartingFrom())
                        .updatedAt(LocalDateTime.now())
                        .createdAt(LocalDateTime.now())
                        .description(byteCodeHandler.blobToString(hotel.getDescription()))
                        .branches(
                                hotel.getBranches().stream().map(e->{
                                    try{
                                        return toResponseBranchDto(e);
                                    }catch (SQLException ex){
                                        throw new RuntimeException(ex);
                                    }
                                }).toList()
                        )
                        .build();
    }

    private ResponseBranchDto toResponseBranchDto(Branch branch)throws SQLException{
        return branch == null ? null:
                ResponseBranchDto.builder()
                        .branchId(branch.getBranchId())
                        .branchName(branch.getBranchName())
                        .roomCount(branch.getRoomCount())
                        .branchType(branch.getBranchType())
                        .build();
    }
}
