package com.project_hotel.hotel_api.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController {
    @GetMapping("/address")
    public String testApi() {
        return "address API is working 🚀";
    }
}
