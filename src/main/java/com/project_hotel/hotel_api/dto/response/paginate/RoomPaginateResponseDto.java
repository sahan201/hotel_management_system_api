package com.project_hotel.hotel_api.dto.response.paginate;

import com.project_hotel.hotel_api.dto.response.ResponseFacilitiesDto;
import com.project_hotel.hotel_api.dto.response.ResponseRoomDto;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RoomPaginateResponseDto {
    private long dataCount;
    private List<ResponseRoomDto> dataList;

}
