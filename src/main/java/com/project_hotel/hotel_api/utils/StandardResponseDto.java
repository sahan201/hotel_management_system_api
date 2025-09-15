package com.project_hotel.hotel_api.utils;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StandardResponseDto {
    private String message;
    private Object data;
    private int code;
}
