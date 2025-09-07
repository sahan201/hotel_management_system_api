package com.project_hotel.hotel_api.dto.request;

import com.project_hotel.hotel_api.enums.BranchType;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RequestBranchDto {

    private String branchName;
    private BranchType branchType;
    private int roomCount;
    private String hotelId;
}
