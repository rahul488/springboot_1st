package com.example.ExamSpringBoot.Service;

import org.springframework.stereotype.Service;

import com.example.ExamSpringBoot.Model.Question;

@Service
public class AddQuestion {
	
	
	public Question addQuestion(String question, String op1, String op2, String op3, String op4, String ans) {
		
		Question q=new Question();
		
		q.setQuestion(question);
		q.setOp1(op1);
		q.setOp2(op2);
		q.setOp3(op3);
		q.setOp4(op4);
		q.setAns(ans);
		
		return q;
		
		
	}
	
	

}
