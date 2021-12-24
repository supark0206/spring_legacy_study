package com.spring.ex;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Student implements InitializingBean,DisposableBean{

	private String name;
	private int age;
	
	public Student(String name, int age) {
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
	public void afterPropertiesSet() {
		System.out.println("afterPropertioesSet()");
		System.out.println("여기는 bean이 생성될 때 처리할 일을 정의합니다");
	}
	@Override
	public void destroy() throws Exception{
		System.out.println("destroy()");
		System.out.println("여기는 bean이 소멸될 때 처리할 일을 정의합니다");
	}
}
