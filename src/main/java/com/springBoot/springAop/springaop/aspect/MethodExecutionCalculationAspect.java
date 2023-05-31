package com.springBoot.springAop.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class MethodExecutionCalculationAspect {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    //execution(* PACKAGE.*.*(..))
    @Around("com.springBoot.springAop.springaop.aspect.CommonJointPointConfig.trackTimeAnnotation()")
    public void after(ProceedingJoinPoint joinPoint) throws Throwable {
        long startTime = System.currentTimeMillis();
        joinPoint.proceed();
        long executionTime = System.currentTimeMillis()-startTime;
        logger.info("Time taken by {} is {}",joinPoint,executionTime);
    }

}
