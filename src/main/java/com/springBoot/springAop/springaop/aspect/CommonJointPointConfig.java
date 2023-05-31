package com.springBoot.springAop.springaop.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonJointPointConfig {
    @Pointcut("execution(* com.springBoot.springAop.springaop.business.*.*(..))")
    public void businessLayerExecution(){
    }
    @Pointcut("@annotation(com.springBoot.springAop.springaop.aspect.TrackTime)")
    public void trackTimeAnnotation(){
    }
}
