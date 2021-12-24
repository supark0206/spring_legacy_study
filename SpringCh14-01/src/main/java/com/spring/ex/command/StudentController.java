package com.spring.ex.command;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class StudentController {
	
	@RequestMapping("/studentForm")
	public String studentForm() {
		return "createPage";
		
	}
	
	@RequestMapping("/student/create")
	public String studentCreate(@ModelAttribute("student") Student student , BindingResult result) {
		String page = "createDonePage";
		
		StudentValidator validator = new StudentValidator();
		validator.validate(student,result);  //validate 메소드 호출
		if(result.hasErrors()) {
			//result 값이 null 이면 createPage를 호출
			page = "createPage";
			
		}
		return page;
	}

}
