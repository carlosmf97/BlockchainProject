package com.blockchain.assessment.sources.person;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Person {
	
	private @Id String email;
	private String name;
	private List<String> answers;
	
	public Person() {}
	
	public Person(String name, String email, List<String> answers) {
		this.name = name;
		this.email = email;
		this.answers = answers;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", email=" + email + "]";
	}

	public List<String> getAnswers() {
		return answers;
	}

	public void setAnswers(List<String> answers) {
		this.answers = answers;
	}
	
	
}
