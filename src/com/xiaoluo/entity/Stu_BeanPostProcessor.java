package com.xiaoluo.entity;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class Stu_BeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessAfterInitialization(Object arg0, String arg1)
			throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("正在开始");
		return arg0;
	}

	@Override
	public Object postProcessBeforeInitialization(Object arg0, String arg1)
			throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("正在结束");
		return arg0;
	}

}
