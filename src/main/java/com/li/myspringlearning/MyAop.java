package com.li.myspringlearning;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAop {

    @Pointcut("execution(public * com.li.myspringlearning.aop.*.*(..))")
    public void webLog() {
    }

    @Before("webLog()")
    public void deBefore(JoinPoint joinPoint) throws Throwable {
        System.out.println("+++++++++++++");
    }


    @After("webLog()")
    public void doAfter(JoinPoint joinPoint) throws Throwable {
        System.out.println("------------");
    }

    @Around("webLog()")
    public void doAround(JoinPoint joinPoint) throws Exception{
        System.out.println("doAround doAround doAround doAround doAround doAround");
    }
}
