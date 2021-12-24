package com.spring.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		String loc = "classpath:applicationCTX.xml";
		
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(loc);
		
		Pencil pen1 = ctx.getBean("pencil2b",Pencil.class);
		Pencil pen2 = ctx.getBean("pencilhb",Pencil.class);
		Pencil pen3 = ctx.getBean("pencil3b",Pencil.class);
		
		pen1.pencilInfo();
		pen2.pencilInfo();
		pen3.pencilInfo();

	}

}
