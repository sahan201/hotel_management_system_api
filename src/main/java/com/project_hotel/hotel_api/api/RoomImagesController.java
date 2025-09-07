package com.project_hotel.hotel_api.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoomImagesController {
    @GetMapping("/roomImages")
    public String testApi() {
        return "room images API is working 🚀";
    }
}
