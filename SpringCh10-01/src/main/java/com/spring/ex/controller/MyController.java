package com.spring.ex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
	
	@RequestMapping("/my")
	public String my() {
		return "my";
		
	}
	
	@RequestMapping("/friend")
	public String friend() {
		return "friend";
		
	}

}
