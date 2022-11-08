package com.blockchain.assessment.sources.person;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.persistence.Id;


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
	
	
	@SuppressWarnings("rawtypes")
	@GetMapping("/person/{id}/{name}")
	public Person getPerson(@PathVariable String id, @PathVariable String name){
		if((Optional) repository.findById(id) != Optional.empty()) {
			Optional<Person> person = repository.findById(id);
			return person.get();
		}
		return null; 
	}
	
	@GetMapping("/person/{id}/{name}/save")
	public Boolean saveNewPerson(@PathVariable String id, @PathVariable String name) {
		if(this.getPerson(id, name) == null) {
			repository.save(new Person(name, id, null));
			return true;
		}
		return false;
	}
	
	@PostMapping("/person/save")
	public Boolean savePerson(@RequestBody Person person) {
		if(this.getPerson(person.getEmail(), person.getName()) == null) {
			repository.save(person);
			return true;
		}
		return false;
	}
}
