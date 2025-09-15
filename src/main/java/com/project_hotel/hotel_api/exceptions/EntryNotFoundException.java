package com.project_hotel.hotel_api.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class EntryNotFoundException extends RuntimeException {
    // It’s an unchecked exception (doesn’t need to be declared with throws).
    // It’s used for errors that happen during runtime,
    // usually when something unexpected occurs (like missing data).
    public EntryNotFoundException(String message) {
        super(message);
        // super(message) = passes that message to the parent class (RuntimeException)
    }
}
