package com.spring.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {

		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationCTX.xml");
		Robot robot = ctx.getBean("robot",Robot.class);  //빈으로 만든 값들을 주입.
		
		System.out.println(robot.getColor());

		ctx.close();
		

	}

}
