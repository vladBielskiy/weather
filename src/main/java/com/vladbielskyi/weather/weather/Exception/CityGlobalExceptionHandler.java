package com.vladbielskyi.weather.weather.Exception;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CityGlobalExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<CityIncorrectData> handleException(Exception e){
        CityIncorrectData data = new CityIncorrectData();
        data.setInfo(e.getMessage());
        return new ResponseEntity<>(data, HttpStatus.BAD_REQUEST);
    }
}

