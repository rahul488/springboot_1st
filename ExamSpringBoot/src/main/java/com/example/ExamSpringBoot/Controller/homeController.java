package com.example.ExamSpringBoot.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class homeController {
	
	@RequestMapping("/login")
	public String login() {
		return "index";
	}
	@RequestMapping("/student")
	public String studentPage() {
		return "StudentPage";
	}
	@RequestMapping("/admin")
	public String adminPage() {
		return "AdminPage";
	}
	

}
