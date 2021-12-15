package com.vladbielskyi.weather.weather.Service;

import com.vladbielskyi.weather.weather.DAO.CityRepository;
import com.vladbielskyi.weather.weather.Entity.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityService {
    @Autowired
    private CityRepository cityRepository;

    public City saveCity(City city){
        return cityRepository.save(city);
    }


}
