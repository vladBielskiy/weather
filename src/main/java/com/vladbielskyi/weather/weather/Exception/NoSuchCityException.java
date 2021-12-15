package com.vladbielskyi.weather.weather.Exception;

public class NoSuchCityException extends RuntimeException{

    public NoSuchCityException(String message) {
        super(message);
    }
}
