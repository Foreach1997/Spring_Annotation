package com.xiaoluo.entity;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Stu {

	private Integer id;
    private String name;
    private int age;
    private String sex;
	public Stu() {
		System.out.println("���ڵ���bean");

	}
	
	public Stu(Integer id, String name, int age, String sex) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.sex = sex;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
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
	public String toString() {
		return "Stu [id=" + id + ", name=" + name + ", age=" + age + ", sex=" + sex + "]";
	}
	/**
	 * ����ע�����ʽ���г�ʼ��
	 */
	@PostConstruct
	public void init(){
		System.out.println(Stu.class+"��ʼ����ʼ");
	}
	/**
	 * ����ע�����ʽ��������
	 */
	@PreDestroy
	public void des(){
		System.out.println(Stu.class+"��������");
	}
	
}
