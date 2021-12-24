package com.spring.ex;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.ex.command.StudentSpecInfo;


@Controller
public class MyController {
	// {stuName} @PathVariable 을 활용해서 사용할수있다
	// 변수명이 같아야한다
	@RequestMapping("/student/{stuName}")
	public String getStu(@PathVariable String stuName, Model m) {
		m.addAttribute("sName",stuName);  // ("jsp에서 사용될변수명",값을받는 변수명)
		
		return "student/stuName";
	}
	
	@RequestMapping("/index")
	public String goIndex() {
		return "index";
	}
	//RequestMethod.GET은 get방식으로 받을때
	@RequestMapping(value="/person", method=RequestMethod.GET)
	
	//뷰페이지에서 값을 넘겨받기때문에 HttpServletRequest 를 사용한다
	public String goPerson(HttpServletRequest r,Model m) {
		System.out.println("Get 방식 입니다!");
		String nick = r.getParameter("nick");
		m.addAttribute("pNick", nick);
		return "/student/nick";
	}
	
	//RequestMethod.GET은 post방식으로 받을때
	//하나의 클래스안에선 같은이름의 메소드를 사용하기위해 오버로딩 을사용
	//오버로딩 - 파라미터의 갯수나,데이터타입을 바꿔 메소드이름을 똑같이 사용한다
	@RequestMapping(value="/person", method=RequestMethod.POST)
	
	//뷰페이지에서 값을 넘겨받기때문에 HttpServletRequest 를 사용한다
	public ModelAndView goPerson(HttpServletRequest r) {
		System.out.println("Get 방식 입니다!");
		
		String nick = r.getParameter("nick");
		ModelAndView mv = new ModelAndView();
		mv.addObject("pNick,",nick);
		mv.setViewName("/student/nick");
		return mv;
	}
	
	
	@RequestMapping("/info")
	public String goInfo() {
		return "info";
	}
	
	@RequestMapping("/stuView")
	//@ModelAttribute  - 변수명을 길게 쓰기싫을때 별명을 줘서 사용.
	public String stuView(@ModelAttribute("ssi") StudentSpecInfo studentSpecInfo) {
		return "stuView";
	}
	
	@RequestMapping("/sConfirm")
	public String studentRedirect(HttpServletRequest request , Model m) {
		
		//redirect 는 prefix suffix 를 이용한 효과가 아니다
		//RequestMapping과 똑같은 효과를 가진다
		//url 상에 studentOk로 바로 적용된다. 그래서 추가적인 RequsetMapping을 써서 연결해준다
		
		String id = request.getParameter("id");
		
		if(id.equals("abcd")) return "redirect:studentOk";
		
		return "redirect:studentNg";
	}
	
	//id 가 abcd 면 /studentOk 매핑으로
	@RequestMapping("/studentOk")
	public String studentOk(Model m) {
		return "student/loginOk";
	}
	
	//id 가 틀리면 studentNg 매핑으로 
	@RequestMapping("/studentNg")
	public String studentNg(Model m) {
		return "student/loginNg";
	}
}
