package com.vladbielskyi.weather.weather.DAO;

import com.vladbielskyi.weather.weather.Entity.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository  extends JpaRepository<City,Integer> {
}
