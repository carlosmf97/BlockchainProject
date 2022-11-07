package com.blockchain.assessment.sources.person;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PersonController {
	@Autowired
	private static PersonRepository repository;
	
	public PersonController(PersonRepository repository){
		this.repository = repository;
	}
	
	@GetMapping ("/person/all")
		public List<Person> getPeople() {
			List<Person> people = repository.findAll();
			return people;
		}
	
	
	@GetMapping("/person/{email}/{name}")
	public Person getPerson(@PathVariable String id, @PathVariable String name){
		if(repository.findById(id) != null) {
			Optional<Person> person = repository.findById(id);
			if(person.get().getAnswers() == null) {
				return person.get();
			}
			return null;
		}
		return new Person(id, name, null); 
	}
}
