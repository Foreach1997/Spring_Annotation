package com.xiaoluo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xiaoluo.config.Mainconfiguation1;

import com.xiaoluo.config.Mainconfiguation2;
import com.xiaoluo.entity.Stu;
import com.xiaoluo.entity.Stu_initAnddis;
import com.xiaoluo.service.Stuservice;

public class test {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(Mainconfiguation2.class);
	   /*//stu bean的获取测试
	    *  Stu s=(Stu) context.getBean("stu");
	    System.out.println(s);	*/
	  /*  // 获取所有的bean的名字
	     String[] beanName= context.getBeanDefinitionNames();
	     for (String string : beanName) {
			System.out.println(string);
		}*/
	  /* Stu_initAnddis stuInitAnddis=(Stu_initAnddis) context.getBean("stuInitAnddis");
	    System.out.println(stuInitAnddis);
	    context.close();*/
		/**
		 * 
		 */
		/*String name[]=context.getBeanDefinitionNames();
		for (String string : name) {
			System.out.println(string);
		}*/
	 Stuservice stuservice=(Stuservice) context.getBean(Stuservice.class);
	 stuservice.add();
	}
}
