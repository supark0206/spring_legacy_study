package com.spring.ex;

import java.util.Scanner;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		String config = null;
				
		Scanner sc =new Scanner(System.in);
		String input = sc.next();
		if(input.equals("real")) config = "real";
		else if(input.equals("sub")) config = "sub";
		
		sc.close();

		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.getEnvironment().setActiveProfiles(config);//환경을 가져온다
		ctx.load("applicationCTX_sub.xml","applicationCTX_real.xml");
		
		Person p1 = ctx.getBean("char",Person.class);
		
		System.out.println("이름 : " + p1.getName());
		System.out.println("직업 : " + p1.getJob());
	}

}
