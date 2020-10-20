package com.example.ExamSpringBoot.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Question {
	
	@Id
	@GeneratedValue
	private int id;
	
	private String Question;
	private String Op1;
	private String Op2;
	private String Op3;
	private String Op4;
	private String ans;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getQuestion() {
		return Question;
	}
	public void setQuestion(String question) {
		Question = question;
	}
	public String getOp1() {
		return Op1;
	}
	public void setOp1(String op1) {
		Op1 = op1;
	}
	public String getOp2() {
		return Op2;
	}
	public void setOp2(String op2) {
		Op2 = op2;
	}
	public String getOp3() {
		return Op3;
	}
	public void setOp3(String op3) {
		Op3 = op3;
	}
	public String getOp4() {
		return Op4;
	}
	public void setOp4(String op4) {
		Op4 = op4;
	}
	public String getAns() {
		return ans;
	}
	public void setAns(String ans) {
		this.ans = ans;
	}
	@Override
	public String toString() {
		return "Question [id=" + id + ", Question=" + Question + ", Op1=" + Op1 + ", Op2=" + Op2 + ", Op3=" + Op3
				+ ", Op4=" + Op4 + ", ans=" + ans +  "]";
	}
	
	
}
