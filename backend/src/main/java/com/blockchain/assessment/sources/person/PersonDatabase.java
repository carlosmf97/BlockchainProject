package com.blockchain.assessment.sources.person;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PersonDatabase {
	private static final Logger log = LoggerFactory.getLogger(PersonDatabase.class);
	
	@Bean
	CommandLineRunner initDatabase(PersonRepository repository) {
	  return args -> {
		log.info("Preloading " + repository.save(new Person("Francisco Marquez Lavado", "francisco.marquez@solera.com", null)));
	    log.info("Preloading " + repository.save(new Person("Carlos Munoz Fernandez", "carlos.munoz@solera.com", null)));
	    log.info("Preloading " + repository.save(new Person("Rodrigo Gamero Luque", "rodrigo.gamero@solera.com", null)));
	   };
	}
}