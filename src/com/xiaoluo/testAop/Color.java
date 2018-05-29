package com.xiaoluo.testAop;

public class Color {
  private String bule;

public Color() {
	super();
}

public Color(String bule) {
	super();
	this.bule = bule;
}

public String getBule() {
	return bule;
}

public void setBule(String bule) {
	this.bule = bule;
}

@Override
public String toString() {
	return "Color [bule=" + bule + "]";
}
  
}
