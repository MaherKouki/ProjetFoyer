package com.example.demo.config;


import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Slf4j
public class LoggingAspect {


    @After("execution(* com.example.demo.service.impl.FoyerServiceImpl.*(..))")
    public void logMethodEntity(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        log.info("Out methode    " + name + ":");
    }
    @Before("execution(* com.example.demo.service.impl.FoyerServiceImpl.*(..))")
    public void logMethodEntityy(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        log.info("In methode    " + name + ":");
    }


}


