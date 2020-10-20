package com.example.ExamSpringBoot.Controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.ExamSpringBoot.Model.Answer;
import com.example.ExamSpringBoot.Model.Question;
import com.example.ExamSpringBoot.Repository.QuestionRepo;
import com.example.ExamSpringBoot.Service.AddAnswer;

@Controller
public class ResultController {
	
	@Autowired
	private QuestionRepo qrepo;
	@Autowired
	private AddAnswer answerservice;
	
	@RequestMapping("/result")
	public String result(HttpServletRequest request,Model model) {

		List<Question> questionSet=qrepo.findAll();
		int mark=0;String status="";
		List<Answer> res=new ArrayList<>();
		for(Question question:questionSet) {
			
			String id=String.valueOf(question.getId());
			
			
			String qst=question.getQuestion();
			
			String ans=question.getAns();
			
			String uans=request.getParameter(id);
			
			if(uans == null) {
				status="Not Attempted";
				res=answerservice.add(res,id,qst,ans,uans,status);
				continue;
			}
			
			else if(uans.equals(ans)) {
				mark+=2;
				status="Correct";
				res=answerservice.add(res,id,qst,ans,uans,status);
			}
			else {
				status="InCoreect";
				res=answerservice.add(res,id,qst,ans,uans,status);
			}
		}
		model.addAttribute("Mark", mark);
		model.addAttribute("Result", res);
		return "result";
	}
	

}
