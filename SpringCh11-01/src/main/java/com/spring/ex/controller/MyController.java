package com.spring.ex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	
	@RequestMapping("/sample")
	public String sample01() {
		
		return "sample/sample01";
	}
	
	@RequestMapping("/second")
	public String sample02() {
		
		return "content/second";
	}
	
	@RequestMapping("/third")
	public String third(Model model){
		
		String university = "경민대";
		String major = "융소과";
		String grade = "3학년";
		String name = "박정현";
		
		model.addAttribute("uni",university);  // (jsp 에서 사용하는 변수명 , 클래스 변수명)
		model.addAttribute("maj",major);  // (jsp 에서 사용하는 변수명 , 클래스 변수명)
		model.addAttribute("gra",grade);  // (jsp 에서 사용하는 변수명 , 클래스 변수명)
		model.addAttribute("nam",name);  // (jsp 에서 사용하는 변수명 , 클래스 변수명)

		
		
		return "content/third";
		
	}
	
	@RequestMapping("ex1")
	public ModelAndView food() {
		// 모델,뷰페이지를 한번에 정의해줄수있다.
		ModelAndView mv = new ModelAndView();
		mv.addObject("food","삼겹살");
		mv.addObject("person", "홍길동");
		mv.addObject("address","서울시 광진구");
		
		mv.setViewName("sample/modelAndView");
		
		return mv;
		
	}

}
