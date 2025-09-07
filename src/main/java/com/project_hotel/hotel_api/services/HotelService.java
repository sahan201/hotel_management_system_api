package com.project_hotel.hotel_api.services;

import com.project_hotel.hotel_api.dto.response.ResponseHotelDto;
import com.project_hotel.hotel_api.dto.response.paginate.HotelPaginateRequestDto;

import java.sql.SQLException;

public interface HotelService {
    public void create(ResponseHotelDto Dto);
    public void update(ResponseHotelDto Dto, String hotelId) throws SQLException;
    public void delete(String hotelId);
    public ResponseHotelDto findById(String hotelId) throws SQLException;
    public HotelPaginateRequestDto findAll(int page, int size, String searchText) throws SQLException;

}
