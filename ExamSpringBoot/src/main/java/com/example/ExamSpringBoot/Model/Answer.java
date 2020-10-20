package com.example.ExamSpringBoot.Model;


public class Answer {
	
	private String id;
	private String question;
	private String ans;
	private String status;
	private String corectans;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAns() {
		return ans;
	}
	public void setAns(String ans) {
		this.ans = ans;
	}
	@Override
	public String toString() {
		return "Answer [id=" + id + ", question=" + question + ", ans=" + ans + ", status=" + status + ", corectans="
				+ corectans + "]";
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCorectans() {
		return corectans;
	}
	public void setCorectans(String corectans) {
		this.corectans = corectans;
	}
	
	
	
}
