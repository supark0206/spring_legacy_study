package com.spring.ex.controller;

import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board")
public class BoardController {

	
	@RequestMapping("/list")
	public String list(Model m) {
		
		m.addAttribute("num", "17830125");
		
		return("board/list");
	}
	
}
