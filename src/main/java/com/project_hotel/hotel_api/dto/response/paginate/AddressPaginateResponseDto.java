package com.project_hotel.hotel_api.dto.response.paginate;

import com.project_hotel.hotel_api.dto.response.ResponseAddressDto;
import com.project_hotel.hotel_api.dto.response.ResponseBranchDto;
import lombok.*;

import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AddressPaginateResponseDto {
    private long dataCount;
    private List<ResponseAddressDto> dataList;

}
