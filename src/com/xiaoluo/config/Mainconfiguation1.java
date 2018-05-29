package com.xiaoluo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import com.xiaoluo.entity.Stu;
import com.xiaoluo.entity.Stu_initAnddis;

@Configuration
//进行扫描包和过滤包
@ComponentScan(value="com.xiaoluo",excludeFilters={@Filter(type=FilterType.ANNOTATION,value={Controller.class,Service.class})})
public class Mainconfiguation1 {
    @Bean
    public Stu_initAnddis stuInitAnddis(){
    	return new Stu_initAnddis();
    }
	@Bean(destroyMethod="init",initMethod="des")
	public Stu stu(){

		return new Stu(1,"123",22,"男");	

//		return new Stu("123",22);	

	}
}
