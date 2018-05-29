package com.xiaoluo.testAop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Colorservice {
	@Autowired
  private Color color;
  public void t(){
	  String c=color.getBule();
	  System.out.println("123"+c);
  }
}
