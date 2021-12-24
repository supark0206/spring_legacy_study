package com.spring.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.spring.ex.work.Avengers;

public class MainClass {

	public static void main(String[] args) {
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationCTX.xml");
		Avengers avgs = ctx.getBean("avg",Avengers.class);
		avgs.attack();
		
		ctx.close();

	}

}
