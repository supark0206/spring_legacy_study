package com.spring.ex;

import java.util.Scanner;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.spring.ex.pencil.Pencil;

public class MainClass {

	public static void main(String[] args) {
		String config = null;
		Scanner sc = new Scanner(System.in);

		System.out.println("사용할 연필 입력하세요 : ");
		String input = sc.next();

		while (true) {
			if (input.equals("HB")) {
				config = "HB";
				break;
			} else if (input.equals("2B")) {
				config = "2B";
				break;
			} else if (input.equals("4B")) {
				config = "4B";
				break;
			}else {
				System.out.println("--입력실패--");
			}
		}
		
		sc.close();
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.getEnvironment().setActiveProfiles(config);
		ctx.load("applicationCTX_HB.xml","applicationCTX_2B.xml","applicationCTX_4B.xml");
		ctx.refresh();
		
		Pencil pen = ctx.getBean("pen",Pencil.class);
		
		pen.use();
		
		ctx.close();

	}

}
