package com.olam.crud.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.olam.crud.entity.Person;
import com.olam.crud.repository.PersonRepository;
import com.olam.crud.service.PersonService;


@Service
public class PersonServiceImpl implements PersonService {
	
	@Autowired
	private PersonRepository personRepository;

	@Override
	public Person savePerson(Person person) {
		// TODO Auto-generated method stub
		return personRepository.saveAndFlush(person);
	}

	@Override
	public Iterable<Person> getAllPersons() {
		// TODO Auto-generated method stub
		return personRepository.findAll();
	}

	@Override
	public Person getPersonById(Long id) {
		// TODO Auto-generated method stub
		return personRepository.getOne(id);
	}

	@Override
	public void updateData(Long id, Person person) {
		
		Person one = personRepository.getOne(id);
		one.setAddress(person.getAddress());
		
		
	}

	@Override
	public void deletePersonById(Long id) {
		
		personRepository.deleteById(id);
		
	}

}
