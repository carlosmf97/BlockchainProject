package com.blockchain.assessment.sources.questionaire;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

@Configuration
public class QuestionaireDatabase {
	private static final Logger log = LoggerFactory.getLogger(QuestionaireDatabase.class);
	
	@Bean
	CommandLineRunner initDatabase2(QuestionaireRepository repository) {
	  return args -> {
		log.info("Preloading " + repository.save(new Questionaire("How big is your company?", createAnswers("0-10", "10-100", "+100"))));
		log.info("Preloading " + repository.save(new Questionaire("How many users you have?", createAnswers("0", "10-100", "100-1000", "+1000"))));
	   };
	}
	
	public List<String> createAnswers(String ... answer){
		List<String> answers = new ArrayList<>();
		for(int i = 0; i < answer.length; i++) {
			answers.add(answer[i]);
		}
		return answers;
	}	
}