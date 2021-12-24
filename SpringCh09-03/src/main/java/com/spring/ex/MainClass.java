package com.spring.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationCTX.xml");
		
		Student st = ctx.getBean("stu",Student.class);
		st.getInfo();
		
		Worker wk = ctx.getBean("work",Worker.class);
		wk.getWork();
		
		ctx.close();

	}

}
