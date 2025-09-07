package com.project_hotel.hotel_api.dto.response;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ResponseRoomImagesDto {
    private Long id;
    private String directory;
    private String fileName;
    private String hash;
    private String resourceUrl;
    private String roomId;
}
