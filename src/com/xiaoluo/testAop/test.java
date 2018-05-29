package com.xiaoluo.testAop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class test {
   public static void main(String[] args) {
	 AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(Mainconfiguation3.class);
     Colorservice colorservice=context.getBean(Colorservice.class);
     colorservice.t();
   
}
}
