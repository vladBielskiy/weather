package com.vladbielskyi.weather.weather.Controller;

import com.vladbielskyi.weather.weather.Communication;
import com.vladbielskyi.weather.weather.Entity.City;
import com.vladbielskyi.weather.weather.Exception.NoSuchCityException;
import com.vladbielskyi.weather.weather.Service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api")
public class MainController {

    @Autowired
    private CityService cityService;
    @Autowired
    private Communication communication;

    @GetMapping("/getCityWeather/{name}")
    public City getCity(@PathVariable("name") String name){
if(communication.getCityByName(name) == null){
    throw new NoSuchCityException("city not found");
}
City city = communication.getCityByName(name);
city.getDt().setTime(city.getDt().getTime() * 1000L);
        return cityService.saveCity(city);

    }

}
