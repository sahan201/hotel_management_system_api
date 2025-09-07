package com.project_hotel.hotel_api.services.impl;

import com.project_hotel.hotel_api.dto.response.ResponseHotelDto;
import com.project_hotel.hotel_api.dto.response.paginate.HotelPaginateRequestDto;
import com.project_hotel.hotel_api.services.HotelService;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
@Service
public class HotelServiceImpl implements HotelService {
    @Override
    public void create(ResponseHotelDto Dto) {

    }

    @Override
    public void update(ResponseHotelDto Dto, String hotelId) throws SQLException {

    }

    @Override
    public void delete(String hotelId) {

    }

    @Override
    public ResponseHotelDto findById(String hotelId) throws SQLException {
        return null;
    }

    @Override
    public HotelPaginateRequestDto findAll(int page, int size, String searchText) throws SQLException {
        return null;
    }
}
