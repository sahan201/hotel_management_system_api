package com.project_hotel.hotel_api.services.impl;

import com.project_hotel.hotel_api.dto.request.RequestRoomDto;
import com.project_hotel.hotel_api.dto.response.ResponseRoomDto;
import com.project_hotel.hotel_api.dto.response.paginate.RoomPaginateResponseDto;
import com.project_hotel.hotel_api.services.RoomService;
import org.springframework.stereotype.Service;

@Service
public class RoomServiceImpl implements RoomService {
    @Override
    public void create(RequestRoomDto Dto) {

    }

    @Override
    public void update(RequestRoomDto Dto, String roomId) {

    }

    @Override
    public void delete(String roomId) {

    }

    @Override
    public ResponseRoomDto findById(String roomId) {
        return null;
    }

    @Override
    public RoomPaginateResponseDto findAll(int page, int size) {
        return null;
    }
}
