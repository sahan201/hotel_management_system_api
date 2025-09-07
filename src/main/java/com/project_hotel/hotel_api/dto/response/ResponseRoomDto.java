package com.project_hotel.hotel_api.dto.response;

import java.math.BigDecimal;
import java.util.List;

public class ResponseRoomDto {
    private String roomId;
    private int bedCount;
    private boolean isAvailable;
    private BigDecimal price;
    private String description;
    private String roomNumber;
    private String roomType;
    private String branchId;

    private List<ResponseFaciltiesDto>  facilties;
    private List<ResponseRoomImagesDto> images;

}
