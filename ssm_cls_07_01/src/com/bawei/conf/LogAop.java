package com.bawei.conf;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class LogAop {
	//后置通知
	public void doAfter(){
		//后置通知的具体逻辑   日志记录功能
		System.out.println("-----后置通知-----已经完成日志记录");
	}
	//前置通知
	public void doBefore(JoinPoint jp){
		// JoinPoint jp 获取切入点方法的实参
		Object[] objs = jp.getArgs();//获取参数数组
		System.out.print("-----前置通知-----方法执行之前的参数是:");
    		for(Object param : objs){
    			System.out.println(param+",");
    		}
	}
	//环绕通知
	public void doAround(ProceedingJoinPoint pj) throws Throwable{
		Object[] objs=pj.getArgs();//获取参数
		System.out.println("----环绕通知---方法执行之前---"+objs[0]);
		Object result=pj.proceed();//执行切入点方法获取返回结果
		System.out.println("----环绕通知---方法执行之后的返回值---"+result);
	}
	//异常通知
	public void doThrowable(){
		System.out.println("----异常通知-----");
	}
	//最终通知 返回通知
	public void doAfterReturn(Object retrunMessage){
		System.out.println("-----返回通知-----"+retrunMessage);
	}
}
