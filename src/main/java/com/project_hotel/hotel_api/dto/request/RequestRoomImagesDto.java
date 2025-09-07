package com.project_hotel.hotel_api.dto.request;

import lombok.*;
import org.springframework.web.multipart.MultipartFile;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RequestRoomImagesDto {
    private MultipartFile file;
    private String roomId;

}
