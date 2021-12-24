package com.spring.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		String configLocation1 = "classpath:applicationCTX01.xml";
		String configLocation2 = "classpath:applicationCTX02.xml";	
		//빈을 추가함
		//스플이 컨테이너 생성 , 설정 파일이 다수인경우 (1,2) 이런식으로 사용
		AbstractApplicationContext ctx = 
	    new GenericXmlApplicationContext(configLocation1,configLocation2);
		
		//스프링 컨테이너에서 객체생성
		Student st1 = ctx.getBean("stu1",Student.class);
		
		System.out.println(st1.getName());
		System.out.println(st1.getHobbys());
		System.out.println(st1.getAge());
		System.out.println(st1.getHeight());
		System.out.println(st1.getWeight());
		
		StudentInfo stIn = ctx.getBean("stuInfo1",StudentInfo.class);
		Student st2 = stIn.getStu();
		System.out.println(st1.getName());
		System.out.println(st1.getHobbys());
		System.out.println(st1.getAge());
		System.out.println(st1.getHeight());
		System.out.println(st1.getWeight());
		
		if(st1.equals(st2)) System.out.println("st1과 st2는 같은사람");
		else System.out.println("st1과 st2는 다른사람");
		
		Student st3 = ctx.getBean("stu2",Student.class);
		System.out.println(st3.getName());
		System.out.println(st3.getHobbys());
		System.out.println(st3.getAge());
		System.out.println(st3.getHeight());
		System.out.println(st3.getWeight());
		if(st1.equals(st3)) System.out.println("st1과 st3는 같은사람");
		else System.out.println("st1과 st3는 다른사람");
		
		Family fm  = ctx.getBean("fam",Family.class);
		System.out.println(fm.getPapa());
		System.out.println(fm.getMama());
		System.out.println(fm.getBro());
		System.out.println(fm.getSis());
		
		ctx.close();
		
		
	}

}
