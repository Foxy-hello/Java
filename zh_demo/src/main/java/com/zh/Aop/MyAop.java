package com.zh.Aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAop {


    public Object MyAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("方法名: "+proceedingJoinPoint.getSignature().getName());
        long time = System.currentTimeMillis();
        Object proceed = proceedingJoinPoint.proceed();
        long time2 = System.currentTimeMillis();
        System.out.println("方法执行了"+(time2-time)+"毫秒");
        return proceed;
    }
}
