package com.spring.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		String loc = "classpath:applicationCTX.xml"; //  그냥 문자열 만들어놓음
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(); // 컨테이너 생성
		
		ctx.load(loc);// 값을 로드 시킴 , bean들을 읽어줌  <- bean 을 생성
		
		ctx.refresh();// 설정완료
		
		Student st = ctx.getBean("stu",Student.class); //사용

		System.out.println("이름 : " + st.getName());
		System.out.println("나이 : " + st.getAge());
		
		ctx.close(); // 소멸  , 컨테이너가 소멸될때 bean도 같이 소멸됨

	}

}
