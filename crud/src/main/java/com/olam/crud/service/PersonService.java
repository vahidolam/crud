package com.olam.crud.service;

import com.olam.crud.entity.Person;

public interface PersonService {
	
	public Person savePerson(Person person);
	public Iterable<Person> getAllPersons();
	public Person getPersonById(Long id);
	public void updateData(Long id,Person person);
	
	public void deletePersonById(Long id);

}
