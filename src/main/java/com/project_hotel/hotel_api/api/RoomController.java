package com.project_hotel.hotel_api.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoomController {
    @GetMapping("/room")
    public String testApi() {
        return "room API is working 🚀";
    }
}
