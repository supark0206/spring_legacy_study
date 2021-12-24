package com.spring.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		String loc = "classpath:applicationCTX.xml";
		
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(loc);
		
		Student st1 = ctx.getBean("stu",Student.class);
		System.out.println("이름 :"+st1.getName());
		System.out.println("나이 :"+st1.getAge());
		System.out.println("=============================");
		
		Student st2 = ctx.getBean("stu",Student.class);
		st2.setName("정해인");
		st2.setAge(44);
		System.out.println("이름 :"+st2.getName());
		System.out.println("나이 :"+st2.getAge());
		System.out.println("=============================");
		System.out.println("이름 :"+st1.getName());
		System.out.println("나이 :"+st1.getAge());
		System.out.println("=============================");  //바꾸고나면 st1으로 찍어도 값이 바뀜
		
		
		if(st1.equals(st2)) {
			System.out.println("st1 == st2");
		}else {
			System.out.println("다르다");
		}
		
		ctx.close();
		
		// 결과 st1과 st2는 같다고 나옴 
		// 그이유는 scope를 싱글톤으로 했기 때문이다
		// bean 객체를 공유해서 쓰겠다
		
		//prototype으로하면 bean을 다른값을 꺼낸다
	}

}
