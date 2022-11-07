package com.blockchain.assessment.sources.questionaire;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Questionaire {
	private @Id @GeneratedValue Long id;
	private String question;
	private List<String> answers;
	
	public Questionaire() {}
	
	public Questionaire(String question, List<String> answers) {
		this.question = question;
		this.answers = answers;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public List<String> getAnswers() {
		return answers;
	}

	public void setAnswers(List<String> answers) {
		this.answers = answers;
	}

	@Override
	public String toString() {
		return "Questionaire [question=" + question + ", answers=" + answers + "]";
	}
	
	
	
}
