package com.spring.ex;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("board")
public class ExController {

	@RequestMapping("write")
	public String write(Model m) {
		m.addAttribute("university", "경민대학교");
		m.addAttribute("major", "융소과");
		m.addAttribute("grade", "3학년");
		m.addAttribute("name", "박정현");
		m.addAttribute("star", "아이유");
		
		return "write";
	}

	
}
