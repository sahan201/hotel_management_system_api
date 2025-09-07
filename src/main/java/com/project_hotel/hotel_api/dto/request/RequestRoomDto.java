package com.project_hotel.hotel_api.dto.request;

import lombok.*;

import java.math.BigDecimal;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RequestRoomDto {
    private int price;
    private String roomNumber;
    private int bedCount;
    private boolean isAvailable;
    private String roomType;
    private String branchId;
}
