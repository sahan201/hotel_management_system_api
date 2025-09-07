package com.project_hotel.hotel_api.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FacilitiesController { @GetMapping("/facilities")
public String testApi() {
    return "facilities API is working 🚀";
}
}
