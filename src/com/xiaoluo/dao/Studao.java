package com.xiaoluo.dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class Studao {
   
  @Autowired
  private  JdbcTemplate jdbcTemplate;
  public void add(){
	  String sql="insert into stu(name,age,sex) values(?,?,?)";
	  jdbcTemplate.update(sql, "Ð¡Ã÷",15,"ÄÐ");
  }
}
