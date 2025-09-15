package com.project_hotel.hotel_api.dto.response.paginate;

import com.project_hotel.hotel_api.dto.response.ResponseRoomImagesDto;
import lombok.*;

import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RoomImagesPaginateResponseDto {
    private long dataCount;
    private List<ResponseRoomImagesDto> dataList;
}
