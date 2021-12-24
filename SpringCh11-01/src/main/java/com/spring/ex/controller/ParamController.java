package com.spring.ex.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.ex.command.Student;

@Controller
public class ParamController {

	@RequestMapping("/param")
	public String param(HttpServletRequest request,Model m) {
		String id = request.getParameter("mid");      //id 를 받아서 설정해줌
		String pw = request.getParameter("mpw");

		m.addAttribute("mid", id);
		m.addAttribute("mpw", pw);
		
		return "param/param";
	}
	
	@RequestMapping("/param02")
	public String param02(@RequestParam("id") String id_01 ,
			@RequestParam("pw") String pw_01, Model m){
		
		m.addAttribute("id", id_01);
		m.addAttribute("pw", pw_01);
		
		return "param/param";
		
	}
	
	@RequestMapping("/student")
	public String param02(@RequestParam("uni") String uni_01 ,
			@RequestParam("maj") String maj_01, 
			@RequestParam("gra") String gra_01,
			@RequestParam("nam") String nam_01,
		    Model m){
		//@RequestParam(" url 설정할때 사용하는 값")
		// ex) student&uni=경민대
		
		
		Student stu = new Student();  //값 설정
		stu.setUniversity(uni_01);
		stu.setMajor(maj_01);
		stu.setGrade(gra_01);
		stu.setName(nam_01);
		
		m.addAttribute("stuInfo", stu);
		
		return "param/stuInfo";
		
	}
	
	@RequestMapping("/student02")
	public String param02(Student student)
	// 객체의 이름을 클래스명과 동일하게 가져가야한다 커맨드 객체를 사용하겠다는 의미
	{
		
		return "param/stuInfo2";
		
	}
	
	@RequestMapping("param/{name01}")
	public String path(@PathVariable String name01,Model m) {
		
		//name01 은 url에 들어가는값 name01로 값이 설정되어 jsp페이지에서 보여진다
		//ex) param/정현 
		//name01 = 정현
		
		m.addAttribute("name02", name01);
		//name02 = jsp에서 사용되는 변수명   ${name02}
		
		return "param/name";
	}
	
	@RequestMapping("login")
	public String login() {
		
		return "login/login";
	}
	
	@RequestMapping(value = "/result", method = RequestMethod.GET)
	public String loginResult1(HttpServletRequest request,Model m) {
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		m.addAttribute("id", id);
		m.addAttribute("pw", pw);
		
		return "login/result";
	}
	
	@RequestMapping(value = "/result", method = RequestMethod.POST)
	public String loginResult2(HttpServletRequest request,Model m) {
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		m.addAttribute("id", id);
		m.addAttribute("pw", pw);
		
		return "login/result";
	}
}

