package com.bobo.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @description:
 * @author: BOBO
 * @time: 2022/6/9 15:29
 */
@Aspect
@Component
public class MyAop {


    //切点表达式
    @Pointcut(value = "execution(* com.bobo.controller.*.*(..))")
    public void  pointcut(){
    }

    @Around(value = "pointcut()")
    public Object log1(ProceedingJoinPoint pjp) throws Throwable {
        //获取类名
        String className = pjp.getTarget().getClass().getName();
        //获取方法名
        String name = pjp.getSignature().getName();

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date1 = format.format(new Date());
        System.out.println("类名:"+className+"方法名:"+name+"执行时间"+date1 );

       return pjp.proceed();//执行目标方法
    }


}
