package com.spring.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass2 {

	public static void main(String[] args) {
		String configLoc1 = "classpath:application1.xml";
		String configLoc2 = "classpath:application2.xml";
		String configLoc3 = "classpath:application3.xml";
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load(configLoc1,configLoc2,configLoc3);
		ctx.refresh();
		
		Student s1 = ctx.getBean("stu",Student.class);
		System.out.println("이름 : " + s1.getName());
		System.out.println("직업 : " + s1.getJob());
		System.out.println("=====================");
		
		Student s2 = ctx.getBean("stu",Student.class);
		s2.setName("김현아");
		s2.setJob("학생");
		
		System.out.println("이름 : " + s1.getName());
		System.out.println("직업 : " + s1.getJob());
		System.out.println("=====================");
		
		if(s1.equals(s2)) {
			 System.out.println("s1 == s2");
		}else {
			System.out.println("s1 != s2");
		}
		

	}

}
