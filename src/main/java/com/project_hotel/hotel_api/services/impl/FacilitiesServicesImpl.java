package com.project_hotel.hotel_api.services.impl;

import com.project_hotel.hotel_api.dto.request.RequestFacilitiesDto;
import com.project_hotel.hotel_api.dto.response.ResponseFacilitiesDto;
import com.project_hotel.hotel_api.dto.response.paginate.FacilitiesPaginateResponseDto;
import com.project_hotel.hotel_api.services.FacilitiesServices;
import org.springframework.stereotype.Service;

@Service
public class FacilitiesServicesImpl implements FacilitiesServices {
    @Override
    public void create(RequestFacilitiesDto Dto) {

    }

    @Override
    public void update(RequestFacilitiesDto Dto, String facilitiesId) {

    }

    @Override
    public void delete(String facilitiesId) {

    }

    @Override
    public ResponseFacilitiesDto findById(String facilitiesId) {
        return null;
    }

    @Override
    public FacilitiesPaginateResponseDto findAll(int page, int size, String roomId) {
        return null;
    }
}
