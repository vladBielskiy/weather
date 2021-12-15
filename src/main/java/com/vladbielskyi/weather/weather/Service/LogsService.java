package com.vladbielskyi.weather.weather.Service;

import com.vladbielskyi.weather.weather.DAO.LogsRepository;

import com.vladbielskyi.weather.weather.Entity.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;


@Service
public class LogsService {

    @Autowired
    private LogsRepository exceptionLogsRepository;

    public void saveLog(String message){
        exceptionLogsRepository.save(new Log(new Date(),message));
    }
}
