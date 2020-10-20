package com.example.ExamSpringBoot.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.ExamSpringBoot.Model.Answer;

@Service
public class AddAnswer {
	
	public List<Answer> add(List<Answer> res,String id, String qst, String ans, String uans, String status) {
		
		Answer answer=new Answer();
		answer.setQuestion(qst);
		answer.setId(id);
		answer.setAns(uans);
		answer.setCorectans(ans);
		answer.setStatus(status);
		res.add(answer);
		
		return res;
	}

}
