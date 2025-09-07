package com.project_hotel.hotel_api.services;

import com.project_hotel.hotel_api.dto.request.RequestFacilitiesDto;
import com.project_hotel.hotel_api.dto.response.ResponseFacilitiesDto;
import com.project_hotel.hotel_api.dto.response.paginate.FacilitiesPaginateDto;

public interface FacilitiesServices {
    public void create(RequestFacilitiesDto Dto);
    public void update(RequestFacilitiesDto Dto, String facilitiesId);
    public void delete(String facilitiesId);
    public ResponseFacilitiesDto findById(String facilitiesId);
    public FacilitiesPaginateDto findAll(int page, int size, String roomId);
}
