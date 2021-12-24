package com.spring.ex;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

	@RequestMapping("board/confirmId")
	public String confirmId(HttpServletRequest request,Model m) {
		//request 객체를 생성한다
		String urlId = request.getParameter("id");
		String urlPw = request.getParameter("pw");
		
		//request 객체의 값으로 model을 설정해준다
		m.addAttribute("id", urlId);
		m.addAttribute("pw", urlPw);
		
		return "board/confirmId";
	}
	
	@RequestMapping("board/checkId")
	public String checkId(@RequestParam("id")String pid,@RequestParam("pw")String ppw, Model m) {

		
		m.addAttribute("id", pid);
		m.addAttribute("pw", ppw);
		
		return "board/checkId";
	}
	
}
