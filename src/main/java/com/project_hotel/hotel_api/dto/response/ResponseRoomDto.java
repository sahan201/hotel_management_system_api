package com.project_hotel.hotel_api.dto.response;

import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ResponseRoomDto {

    private String roomId;
    private int bedCount;
    private boolean isAvailable;
    private int price;
    private String roomNumber;
    private String roomType;
    private String branchId;

    private List<ResponseFacilitiesDto> facilities;
    private List<ResponseRoomImagesDto> roomImages;

}
