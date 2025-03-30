package com.example.aspects;

import java.time.Duration;
import java.time.Instant;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2)
public class LoggerAspect {
    Logger logger = Logger.getLogger(LoggerAspect.class.getName());

    // @Around("execution(* com.example.component.*.*(..))")
    // public void log(ProceedingJoinPoint joinPoint) throws Throwable {
    //     Instant startTime = Instant.now();
    //     logger.info(joinPoint.getSignature().getName() + "execution has started.");
    //     joinPoint.proceed();
    //     Instant endTime = Instant.now();
    //     long timeElapsed = Duration.between(startTime, endTime).toMillis();
    //     logger.info("Time taken to execute " + joinPoint.getSignature().getName() + " method: " + timeElapsed
    //             + " milliseconds");
    // }

    @Around("@annotation(com.example.annotations.LogAspect)")
    public void log(ProceedingJoinPoint joinPoint) throws Throwable {
        Instant startTime = Instant.now();
        logger.info(joinPoint.getSignature().getName() + "execution has started.");
        joinPoint.proceed();
        Instant endTime = Instant.now();
        long timeElapsed = Duration.between(startTime, endTime).toMillis();
        logger.info("Time taken to execute " + joinPoint.getSignature().getName() + " method: " + timeElapsed
                + " milliseconds");
    }

    @AfterThrowing(value = "execution(* com.example.component.*.*(..))", throwing = "ex")
    public void throwingLog(JoinPoint joinPoint, Exception ex) {
        logger.log(Level.SEVERE, joinPoint.getSignature().getName() + " method exception has occured. Something is wrong: "+ex.getMessage());
    }

    @AfterReturning(value = "execution(* com.example.component.*.*(..))", returning = "retVal")
    public void returningLog(JoinPoint joinPoint, Object retVal){
        logger.log(Level.INFO, joinPoint.getSignature().getName() + " returned a value: " + retVal.toString());
    }
}
