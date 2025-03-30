package com.example.aspects;

import java.util.logging.Logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(0)
public class BeanLogAspect {
    Logger logger = Logger.getLogger(BeanLogAspect.class.getName());
    
    @AfterReturning(value = "@annotation(org.springframework.context.annotation.Bean)", returning = "returnBean")
    public void returingBean(JoinPoint joinPoint, Object returnBean){
        logger.info(joinPoint.getSignature().getName() + " method is returing bean - "+returnBean.toString());
    }
}
