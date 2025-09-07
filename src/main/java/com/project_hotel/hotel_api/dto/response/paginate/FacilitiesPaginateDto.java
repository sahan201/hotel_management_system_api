package com.project_hotel.hotel_api.dto.response.paginate;

import com.project_hotel.hotel_api.dto.response.ResponseFacilitiesDto;
import lombok.*;

import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FacilitiesPaginateDto {
    private long dataCount;
    private List<ResponseFacilitiesDto>  dataList;
}
