package com.project_hotel.hotel_api.dto.response;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class ResponseHotelDto {
    private String hotelId;
    private boolean activeStatus;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private String description;
    private String hotelName;
    private int starRating;
    private BigDecimal startingFrom;
}
