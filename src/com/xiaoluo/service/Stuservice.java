package com.xiaoluo.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xiaoluo.dao.Studao;

@Service
public class Stuservice {
   
	@Autowired
  private Studao studao;
	@Transactional
  public  void add(){
	  studao.add();
	 // int a=1/0;
	  System.out.println("≤Â»Î≥…π¶°£°£°£°£");
  }
	}