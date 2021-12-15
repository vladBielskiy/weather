package com.vladbielskyi.weather.weather;

import com.vladbielskyi.weather.weather.Entity.City;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class Communication {

    private RestTemplate restTemplate;
    @Value("${weather.url}")
    private String URL;
    @Value("${weather.token}")
    private String token;

    public City getCityByName(String name){
        restTemplate = new RestTemplate();
    return restTemplate.getForObject(URL + "?q=" + name + "&appid=" + token,City.class);
    }

}
