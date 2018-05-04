package com.olam.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.olam.crud.entity.Person;
import com.olam.crud.service.PersonService;

@RestController
public class PersonController {
	
	
	@Autowired
	private PersonService personService;
	
	@GetMapping(value="/personMessage")
	public ResponseEntity<String> message() {
		
		return new ResponseEntity<String>("hello vahid ", HttpStatus.OK);
		
	}

	
	@PostMapping(value="/personMessage")
	public ResponseEntity<Person> savePerson(@RequestBody Person person) {
		
		Person savePerson = personService.savePerson(person);
		
		return new ResponseEntity<Person>(savePerson, HttpStatus.CREATED);
		
	}
	
	@GetMapping(value="/getAllPersons")
	public ResponseEntity<Iterable<Person>> getAllPersons() {
		
		 Iterable<Person> allPersons = personService.getAllPersons();
		
		return new ResponseEntity<Iterable<Person>>(allPersons, HttpStatus.OK);
		
	}
	
	@GetMapping(value="/getPersonById/{id}")
	public ResponseEntity<Person> getPersonById(@RequestParam("id") Long id) {
		
		 Person personById = personService.getPersonById(id);
		
		return new ResponseEntity<Person>(personById, HttpStatus.OK);
		
	}
}
