package com.project_hotel.hotel_api.adviser;

import com.project_hotel.hotel_api.exceptions.EntryNotFoundException;
import com.project_hotel.hotel_api.utils.StandardResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class AppWideExceptionHandler {
    @ExceptionHandler(EntryNotFoundException.class)
    public ResponseEntity<StandardResponseDto> handleEntryNotFoundException(EntryNotFoundException ex) {
        return new ResponseEntity<StandardResponseDto>(
                new StandardResponseDto(ex.getMessage(), ex, 404),
                HttpStatus.NOT_FOUND
        );
    }
}
