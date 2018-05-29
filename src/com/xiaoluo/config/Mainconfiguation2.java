package com.xiaoluo.config;

import java.beans.PropertyVetoException;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.mchange.v2.c3p0.ComboPooledDataSource;


@EnableTransactionManagement
@ComponentScan("com.xiaoluo")
@Configuration
public class Mainconfiguation2 {
    @Bean
	public DataSource dataSource(){
		ComboPooledDataSource comboPooledDataSource=new ComboPooledDataSource();
		try {
			comboPooledDataSource.setDriverClass("com.mysql.jdbc.Driver");
		} catch (PropertyVetoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		comboPooledDataSource.setJdbcUrl("jdbc:mysql://localhost:3306/cms");
		comboPooledDataSource.setUser("root");
		comboPooledDataSource.setPassword("123456");
		return comboPooledDataSource;
	}
    @Bean
    public JdbcTemplate jdbcTemplate(){ 
    JdbcTemplate jdbcTemplate=new JdbcTemplate(dataSource());
    	return jdbcTemplate;
    }
	@Bean
	public PlatformTransactionManager transactionManager(){
	     return new DataSourceTransactionManager(dataSource());
	}
}
