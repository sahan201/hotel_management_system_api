package com.project_hotel.hotel_api.services;

import com.project_hotel.hotel_api.dto.request.RequestBranchDto;
import com.project_hotel.hotel_api.dto.response.ResponseBranchDto;
import com.project_hotel.hotel_api.dto.response.paginate.BranchPaginateResponseDto;

import java.sql.SQLException;

public interface BranchService {
    public void create(RequestBranchDto Dto);
    public void update(RequestBranchDto Dto, String branchId);
    public void delete(String branchId);
    public ResponseBranchDto findById(String branchId);
    public BranchPaginateResponseDto findAll(int page, int size, String searchText) throws SQLException;
    public BranchPaginateResponseDto findAllByHotelId(int page, int size, String hotelId, String searchText) throws SQLException;

}
