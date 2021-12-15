package com.vladbielskyi.weather.weather.DAO;

import com.vladbielskyi.weather.weather.Entity.Log;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LogsRepository extends JpaRepository<Log,Integer> {
}
