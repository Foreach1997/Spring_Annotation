package com.xiaoluo.testAop;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@ComponentScan("com.xiaoluo.testAop")
@Configuration
public class Mainconfiguation3 {
    @Bean
	public Color color(){
    	return new Color("»ÆÉ«");
    }
}
