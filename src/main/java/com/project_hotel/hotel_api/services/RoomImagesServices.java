package com.project_hotel.hotel_api.services;

import com.project_hotel.hotel_api.dto.request.RequestRoomImagesDto;
import com.project_hotel.hotel_api.dto.response.ResponseRoomImagesDto;
import com.project_hotel.hotel_api.dto.response.paginate.RoomImagesPaginateResponseDto;

public interface RoomImagesServices {
    public void create(RequestRoomImagesDto Dto);
    public void delete(String imageId);
    public void update(RequestRoomImagesDto Dto, String imageId);
    public ResponseRoomImagesDto findById(String imageId);
    public RoomImagesPaginateResponseDto findAll(int page, int size, String roomId);

}
