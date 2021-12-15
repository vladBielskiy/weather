package com.vladbielskyi.weather.weather.Aspect;



import com.vladbielskyi.weather.weather.Service.LogsService;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class LogAspect {

    @Autowired
   private LogsService logsService;

    @After("execution(public * getCity(String))")
    public void afterGetCityAdvice(){
        logsService.saveLog("Someone got information about the weather in the city");
    }

    @After("execution(public * handleException(Exception))")
    public void afterHandleExceptionAdvice(){
        logsService.saveLog("We got exceptions");
    }

}
