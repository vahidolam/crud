package com.olam.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.olam.crud.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {
	
	

}
