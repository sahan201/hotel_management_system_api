package com.project_hotel.hotel_api.dto.request;

import lombok.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartRequest;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RequestFaciclitiesDto {
    private String name;
    private String roomId;

}
