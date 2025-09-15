package com.project_hotel.hotel_api.adviser;

import com.project_hotel.hotel_api.exceptions.EntryNotFoundException;
import com.project_hotel.hotel_api.exceptions.GenericException;
import com.project_hotel.hotel_api.utils.StandardResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
//This tells Spring Boot that this class will globally catch exceptions thrown by any @RestController in your app.
//Instead of writing try-catch in every controller, you define all your error handling here.
public class AppWideExceptionHandler {


    @ExceptionHandler(EntryNotFoundException.class)
    public ResponseEntity<StandardResponseDto> handleEntryNotFoundException(EntryNotFoundException ex) {
        //Returns a ResponseEntity<StandardResponseDto> → which means an HTTP response with a body.
        return new ResponseEntity<StandardResponseDto>(
                new StandardResponseDto(ex.getMessage(), ex, 404),
                HttpStatus.NOT_FOUND
        );
    }


    //generic exception handler
    @ExceptionHandler(GenericException.class)
    public ResponseEntity<StandardResponseDto> handleGenericException(GenericException ex){
        return new ResponseEntity<>(
            new StandardResponseDto(ex.getMessage(), ex, 500),
            HttpStatus.INTERNAL_SERVER_ERROR
        );
    }

}
