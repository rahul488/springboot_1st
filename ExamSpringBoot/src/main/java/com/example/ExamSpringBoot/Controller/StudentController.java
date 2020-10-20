package com.example.ExamSpringBoot.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.ExamSpringBoot.Model.Question;
import com.example.ExamSpringBoot.Model.Student;
import com.example.ExamSpringBoot.Repository.QuestionRepo;
import com.example.ExamSpringBoot.Repository.StudentRepo;

@Controller
public class StudentController {
	
	@Autowired
	private StudentRepo srepo;
	
	@Autowired
	private QuestionRepo qrepo;
	
		@PostMapping("/signin")
		public String signIn(@RequestParam String email,@RequestParam String password,Model model) {
			if(email == null || email.length() == 0 || password.length() == 0 || password == null)
				return "StudentPage";
			else{
				Student s=srepo.findByemail(email);
				
				
				if(s == null) return "StudentPage";
				
				else if(s.getPassword().equals(password) && s.getEmail().equals(email)) {
					
					List<Question> question=qrepo.findAll();
					
					model.addAttribute("Question", question);
				
					return "exam";
				}
			}
			return "StudentPage";
		}
		@RequestMapping("/signUp")
		public String signUp() {
			
			return "SignUp";
		}
	@RequestMapping("/forgotpw")
	public String forgotPassword() {

		return "forgotPassword";
	}
	@PostMapping("/Forgot")
	public String reoverAccount(@RequestParam String email,@RequestParam String password,@RequestParam String password1) {
		
		Student s=srepo.findByemail(email);
		
		if(s == null) return "forgotPassword";
		
		else if(password.equals(password1)){
			
			s.setPassword(password);
			srepo.saveAndFlush(s);
			
			return "conform";
		
		}
		
		return "StudentPage";
	}
	
	
	@PostMapping("signup")
	public String createAccount(@ModelAttribute Student stud) {
		if(stud.getEmail() == null || stud.getPassword() == null || stud.getEmail().length() == 0 || stud.getPassword().length() == 0)
			return "SignUp";
		stud.setEmail(stud.getEmail());
		stud.setPassword(stud.getPassword());
		srepo.save(stud);
		return "Welcome";
	}
	@RequestMapping("/Goback")
	public String backButton() {
		
		return "StudentPage";
	}
	@RequestMapping("/conform")
	public String confrom() {
		return "StudentPage";
	}
	
}
