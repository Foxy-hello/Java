package com.bawei.conf;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component   //等价于<bean id="logAop" class="com.bawei.conf.LogAop"></bean>
@Aspect  //等价于<aop:aspect ref="logAop">
public class LogAop {
	
	//定义切入点  等价于<aop:pointcut expression="execution(* com.bawei.service.impl.MeetingServiceImpl.*(..))" id="pointCut"/>
	//切片类中声明一个空方法(私有的),通过注解配置成切入点
	@Pointcut("execution(* com.bawei.service.impl.MeetingServiceImpl.*(..))")
	private void pointCut(){
		
	}
	
	//后置通知 等价于<aop:after method="doAfter" pointcut-ref="pointCut"/>
	@After("pointCut()")
	public void doAfter(){
		//后置通知的具体逻辑   日志记录功能
		System.out.println("-----后置通知-----已经完成日志记录");
	}
	
	//前置通知 等价于<aop:before method="doBefore" pointcut-ref="pointCut"/>
	@Before("pointCut()")
	public void doBefore(JoinPoint jp){
		// JoinPoint jp 获取切入点方法的实参
		Object[] objs=jp.getArgs();
		System.out.println("-----前置通知-----方法执行之前的参数是:"+objs[0]);
	}
	//环绕通知
	@Around("pointCut()")
	public void doAround(ProceedingJoinPoint pj) throws Throwable{
		Object[] objs=pj.getArgs();//获取参数
		System.out.println("----环绕通知---方法执行之前---"+objs[0]);
		Object result=pj.proceed();//执行切入点方法获取返回结果
		System.out.println("----环绕通知---方法执行之后的返回值---"+result);
	}
	//异常通知
	@AfterThrowing(value="method()",throwing="e")
	public void doThrowable(Throwable e){
		System.out.println("----异常通知-----");
	}
	//最终通知 返回通知  等价于<aop:after-returning method="doAfterReturn" pointcut-ref="pointCut" returning="retrunMessage"/>
	@AfterReturning(value="pointCut()",returning="retrunMessage")
	public void doAfterReturn(Object retrunMessage){
		System.out.println("-----返回通知-----"+retrunMessage);
	}
}



