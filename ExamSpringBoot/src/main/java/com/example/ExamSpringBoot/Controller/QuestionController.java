package com.example.ExamSpringBoot.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.ExamSpringBoot.Model.Question;
import com.example.ExamSpringBoot.Repository.QuestionRepo;
import com.example.ExamSpringBoot.Service.AddQuestion;

@Controller
public class QuestionController {

	@Autowired
	private QuestionRepo qrepo;
	@Autowired
	private AddQuestion qserv;
	
	@PostMapping("/add")
	public String addQuestion(@RequestParam String question,@RequestParam String Op1,@RequestParam String Op2,@RequestParam String Op3,@RequestParam String Op4,@RequestParam String ans) {
		
		if(question == null || question.length() == 0 )
			return "addQuestion";
		
		Question q=qserv.addQuestion(question,Op1,Op2,Op3,Op4,ans);
		
		qrepo.save(q);
		
		return "addQuestion";
	}
	
	
	
	
}
