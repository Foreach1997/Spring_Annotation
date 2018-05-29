package com.xiaoluo.entity;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * 
 * 利用接口对该类进行初始化方法和销毁方法
 * @author Administrator
 *
 */
public class Stu_initAnddis implements InitializingBean, DisposableBean {
    private String name;
    private int age;
    
	public Stu_initAnddis() {
		super();
	}

	public Stu_initAnddis(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
        System.out.println(Stu_initAnddis.class+"初始化");
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		 System.out.println(Stu_initAnddis.class+"销毁");
	}

}
