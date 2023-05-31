package com.springBoot.springAop.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AfterAopAspect {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    //execution(* PACKAGE.*.*(..))
    @After("execution(* com.springBoot.springAop.springaop.business.*.*(..))")
    public void after(JoinPoint joinPoint){
        logger.info("After execution of {}",joinPoint);
    }
    @AfterReturning(value = "execution(* com.springBoot.springAop.springaop.business.*.*(..))", returning = "result")
    public void afterReturning(JoinPoint joinPoint, Object result){
        logger.info("{} returned after execution of {}",joinPoint,result);
    }
//    @AfterThrowing(value = "execution(* com.springBoot.springAop.springaop.business.*.*(..))", throwing = "result")
//    public void afterThrowing(JoinPoint joinPoint, Object exception){
//        logger.info("{} throws an exception {}",joinPoint,exception);
//    }
}
