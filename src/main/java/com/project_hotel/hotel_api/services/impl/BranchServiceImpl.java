package com.project_hotel.hotel_api.services.impl;

import com.project_hotel.hotel_api.dto.request.RequestBranchDto;
import com.project_hotel.hotel_api.dto.response.ResponseBranchDto;
import com.project_hotel.hotel_api.dto.response.paginate.BranchPaginateResponseDto;
import com.project_hotel.hotel_api.services.BranchService;
import org.springframework.stereotype.Service;

import java.sql.SQLException;

@Service
public class BranchServiceImpl implements BranchService {
    @Override
    public void create(RequestBranchDto Dto) {

    }

    @Override
    public void update(RequestBranchDto Dto, String branchId) {

    }

    @Override
    public void delete(String branchId) {

    }

    @Override
    public ResponseBranchDto findById(String branchId) {
        return null;
    }

    @Override
    public BranchPaginateResponseDto findAll(int page, int size, String searchText) throws SQLException {
        return null;
    }

    @Override
    public BranchPaginateResponseDto findAllByHotelId(int page, int size, String hotelId, String searchText) throws SQLException {
        return null;
    }
}
