package com.project_hotel.hotel_api.dto.response.paginate;

import com.project_hotel.hotel_api.dto.response.ResponseRoomImagesDto;
import lombok.*;

import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RoomImagesPaginateDto {
    private long dataCount;
    private List<ResponseRoomImagesDto> dataList;
}
