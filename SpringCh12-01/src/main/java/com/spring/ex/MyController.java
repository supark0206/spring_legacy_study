package com.spring.ex;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	
	@RequestMapping("/first")  // 호출하는 url
	public String first() {
		return "first";   // 뷰를 결정 하는 부분  
	}
	
	@RequestMapping("/content/second")
	public String second(Model m) {
		m.addAttribute("name","박정현");   //(el로 사용할 변수명,사용할 값)
		return "content/second"; //prefix , 파일명 , subfix(.jsp) 이렇게 리턴해서 파일경로를 불러와준다
		 
	}
	
	@RequestMapping("/star")
	public String star(Model m) {
		m.addAttribute("star","박보영");   //(el로 사용할 변수명,사용할 값)
		return "content/second"; //prefix , 파일명 , subfix(.jsp) 이렇게 리턴해서 파일경로를 불러와준다
		 
	}

	@RequestMapping("/third")
	public ModelAndView third() {
		ModelAndView mav= new ModelAndView();
		mav.addObject("star", "배수지");     //객체에 데이터를 담는다
		mav.setViewName("content/third");  //뷰페이지 경로를 담는다
		return mav;   // 설정된 객체를 반환한다 원래는 직접 뷰페이지를 반환하지만 
					  // setViewName을 통해 뷰페이지 경로를 mav 객체에 설정해줬다
		
	}

}
