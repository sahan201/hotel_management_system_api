package com.project_hotel.hotel_api.dto.response.paginate;

import com.project_hotel.hotel_api.dto.response.ResponseHotelDto;
import lombok.*;

import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class HotelPaginateRequestDto {
    private List<ResponseHotelDto> dataList;
    private long dataCount;
    private int page;
    private int pageSize;
}
