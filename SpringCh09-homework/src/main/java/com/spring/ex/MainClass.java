package com.spring.ex;

import java.util.Scanner;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		String config = null;
			System.out.println("연필 종류를 입력하세요 !!");
			Scanner sc =new Scanner(System.in);
			String input = sc.next();
			
			if(input.equals("2B")) config = "2B";
			else if(input.equals("HB")) config = "HB";
			else if(input.equals("4B")) config = "4B";
			else System.out.println("다시 입력하세요!!");
			sc.close();
			
			GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
			ctx.getEnvironment().setActiveProfiles(config);//환경을 가져온다
			ctx.load("pencil_2B.xml","pencil_4B.xml","pencil_HB.xml");
			
			Pencil p1 = ctx.getBean("pencil",Pencil.class);
			
			System.out.println("연필종류 : " + p1.getName());
			System.out.println("가격 : " + p1.getPrice());
			System.out.println("색상 : " + p1.getColor());
			System.out.println("길이 : " + p1.getLength());
			ctx.close();


		
	}

}
