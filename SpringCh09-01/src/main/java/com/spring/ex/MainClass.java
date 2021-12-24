package com.spring.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		String loc = "classpath:applicationCTX.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(loc);
		
		//객체생성
		AdminConnection connect = ctx.getBean("con",AdminConnection.class);
		System.out.println("adminId : " + connect.getAdminId());
		System.out.println("adminPw : " + connect.getAdminPw());
		System.out.println("subAdminId : " + connect.getSubAdminId());
		System.out.println("subAdminPw : " + connect.getSubAdminPw());

		
		ctx.close();
	}

}
