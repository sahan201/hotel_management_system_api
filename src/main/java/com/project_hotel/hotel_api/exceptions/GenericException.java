package com.project_hotel.hotel_api.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.EXPECTATION_FAILED)
public class GenericException extends RuntimeException {
    public GenericException(String message){
        super(message);
    }
    
}
