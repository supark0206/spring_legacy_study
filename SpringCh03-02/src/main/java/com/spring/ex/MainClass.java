package com.spring.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		String configLoc = "classpath:applicationCTX.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLoc);
		
		Student student1 = ctx.getBean("stu1",Student.class);
		Student student2 = ctx.getBean("stu2",Student.class);
		Student student3 = ctx.getBean("stu3",Student.class);
		StudentInfo student4 = ctx.getBean("stu4",StudentInfo.class);
		
		student4.stuInfoPrint();
		
		student4.setStu(student1);
		student4.stuInfoPrint();
		
		student4.setStu(student3);
		student4.stuInfoPrint();
		
		student4.setStu(student2);
		student4.stuInfoPrint();

		ctx.close();
		

	}

}
