package com.spring.ex;


import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		String loc1 = "classpath:applicationCTX.xml";
		String loc2 = "classpath:applicationCTX2.xml";
		String config = null;
		

		
		config="main";

		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.getEnvironment().setActiveProfiles(config);
		ctx.load(loc1,loc2);
		
		Student stu = ctx.getBean("stu2",Student.class);
		
		System.out.println(stu.getAge());
		System.out.println(stu.getName());
		
		
	}

}
