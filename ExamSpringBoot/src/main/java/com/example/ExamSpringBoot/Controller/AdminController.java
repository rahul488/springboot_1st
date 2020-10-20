package com.example.ExamSpringBoot.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AdminController {
	
	@RequestMapping("/go")
	public String AdminLogin(@RequestParam String code) {
		if(code.equalsIgnoreCase("#54nalanda@23")) 
			return "addQuestion";
		
		return "AdminPage";
		
	}


}
