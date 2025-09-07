package com.project_hotel.hotel_api.dto.request;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RequestHotelDto {
    private String hotelName;
    private String description;
    private int starRating;
    private BigDecimal startingFrom;
}
