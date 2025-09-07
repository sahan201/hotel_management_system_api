package com.project_hotel.hotel_api.services;

import com.project_hotel.hotel_api.dto.request.RequestAddressDto;
import com.project_hotel.hotel_api.dto.response.ResponseAddressDto;

public interface AddressService {
    public void create(RequestAddressDto Dto);
    public void update(RequestAddressDto Dto, String addressId);
    public void delete(String addressId);
    public ResponseAddressDto findById(String addressId);
    public ResponseAddressDto findByBranchId(String branchId);

}
