package com.project_hotel.hotel_api.dto.request;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RequestAddressDto {
    private String address;
    private String city;
    private String branchId;
    private String country;
    private BigDecimal latitude;
    private BigDecimal longitude;
}
