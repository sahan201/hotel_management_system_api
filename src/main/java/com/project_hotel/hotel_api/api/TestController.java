package com.project_hotel.hotel_api.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping ("/test")
    public String testApi() {
        return "Hotel API is working 🚀";
    }
}

//  In Spring Boot,
//  a REST API Controller is a class
//  that handles HTTP requests (like GET, POST, PUT, DELETE) and
//  sends back HTTP responses.