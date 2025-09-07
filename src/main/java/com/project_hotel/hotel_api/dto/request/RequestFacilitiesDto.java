package com.project_hotel.hotel_api.dto.request;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RequestFacilitiesDto {
    private String name;
    private String roomId;

}
