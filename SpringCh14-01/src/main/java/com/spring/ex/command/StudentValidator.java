package com.spring.ex.command;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

// Validator라는 인터페이스를 상속받아서 사용
//Validator인터페이스 안의 메소드 2가지 supports,validate
public class StudentValidator implements Validator {

	
	//검증할 객체의 클래스 타입 정보
	@Override
	public boolean supports(Class<?> arg0) {
		return Student.class.isAssignableFrom(arg0);   
	}

	//검증하고 에러가 검출되는지 확인한다
	@Override
	public void validate(Object obj, Errors errors) {
		System.out.println("validate()");
		Student student = (Student)obj;
		
		String studentName = student.getName();
		if(studentName == null || studentName.trim().isEmpty()) {  
			//trim() 공백제거 , 널이면
			System.out.println("studentName is null empty");
			//errors 세팅  .rejectValue -> 거부하는 값
			errors.rejectValue("name", "trouble");
		}
		
		int studentId = student.getId();
		
		if(studentId == 0) {
			System.out.println("studentId is 0");
			errors.rejectValue("id", "trouble");
		}
		
	}
	

}
