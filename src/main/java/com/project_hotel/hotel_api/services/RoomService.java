package com.project_hotel.hotel_api.services;

import com.project_hotel.hotel_api.dto.request.RequestRoomDto;
import com.project_hotel.hotel_api.dto.response.ResponseRoomDto;
import com.project_hotel.hotel_api.dto.response.paginate.RoomPaginateResponseDto;

public interface RoomService {
    public void create(RequestRoomDto Dto);
    public void update(RequestRoomDto Dto, String roomId);
    public void delete(String roomId);
    public ResponseRoomDto findById(String roomId);
    public RoomPaginateResponseDto findAll(int page, int size);
}
