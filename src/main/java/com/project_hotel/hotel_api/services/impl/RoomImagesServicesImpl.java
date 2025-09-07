package com.project_hotel.hotel_api.services.impl;

import com.project_hotel.hotel_api.dto.request.RequestRoomImagesDto;
import com.project_hotel.hotel_api.dto.response.ResponseRoomImagesDto;
import com.project_hotel.hotel_api.dto.response.paginate.RoomImagesPaginateDto;
import com.project_hotel.hotel_api.services.RoomImagesServices;
import org.springframework.stereotype.Service;

@Service
public class RoomImagesServicesImpl implements RoomImagesServices {
    @Override
    public void create(RequestRoomImagesDto Dto) {

    }

    @Override
    public void delete(String imageId) {

    }

    @Override
    public void update(RequestRoomImagesDto Dto, String imageId) {

    }

    @Override
    public ResponseRoomImagesDto findById(String imageId) {
        return null;
    }

    @Override
    public RoomImagesPaginateDto findAll(int page, int size, String roomId) {
        return null;
    }
}
