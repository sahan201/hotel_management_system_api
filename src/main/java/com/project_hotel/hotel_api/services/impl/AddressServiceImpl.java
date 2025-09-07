package com.project_hotel.hotel_api.services.impl;

import com.project_hotel.hotel_api.dto.request.RequestAddressDto;
import com.project_hotel.hotel_api.dto.response.ResponseAddressDto;
import com.project_hotel.hotel_api.services.AddressService;
import org.springframework.stereotype.Service;

@Service
public class AddressServiceImpl implements AddressService {
    @Override
    public void create(RequestAddressDto Dto) {

    }

    @Override
    public void update(RequestAddressDto Dto, String addressId) {

    }

    @Override
    public void delete(String addressId) {

    }

    @Override
    public ResponseAddressDto findById(String addressId) {
        return null;
    }

    @Override
    public ResponseAddressDto findByBranchId(String branchId) {
        return null;
    }
}
