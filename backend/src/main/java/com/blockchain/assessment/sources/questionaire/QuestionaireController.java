package com.blockchain.assessment.sources.questionaire;

import java.util.List;
import java.util.Optional;

import org.aspectj.weaver.patterns.TypePatternQuestions.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.blockchain.assessment.sources.person.PersonRepository;


@RestController
public class QuestionaireController {
	@Autowired
	private static QuestionaireRepository repository;
	
	public QuestionaireController(QuestionaireRepository repository){
		this.repository = repository;
	}
	
	@GetMapping("/question/all")
	public List<Questionaire> getAllQuestions() {
		return repository.findAll();
	}
	
	@GetMapping("/question/{id}")
	public Questionaire getQuestion(@PathVariable Long id){
		Optional<Questionaire> question = repository.findById(id);
		return question.get();
	}
	
}
