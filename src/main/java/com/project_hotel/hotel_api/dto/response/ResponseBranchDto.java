package com.project_hotel.hotel_api.dto.response;

import com.project_hotel.hotel_api.enums.BranchType;
import lombok.*;

import java.math.BigDecimal;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ResponseBranchDto {
    private String branchId;
    private String branchName;
    private BranchType branchType;
    private int roomCount;
    private String hotelId;

}
