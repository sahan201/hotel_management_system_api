package com.project_hotel.hotel_api.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HotelController { @GetMapping("/hotel")
public String testApi() {
    return "Hotel API is working 🚀";
}
}
