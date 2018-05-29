package com.xiaoluo.testAop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ColorAop {
  @Pointcut("execution(* com.xiaoluo.testAop.Colorservice.*(..))")
  public void anymethod(){
	  
  }
	
  @Before(value = "anymethod()")
  public void before(){
	  System.out.println("ǰ��֪ͨ");
  }
  @After(value = "anymethod()")
  public void after(){
	  System.out.println("����֪ͨ");
  }
  @AfterReturning(pointcut="anymethod()")
  public void ret(){
	  System.out.println("����֪ͨ");
  }
  
}
