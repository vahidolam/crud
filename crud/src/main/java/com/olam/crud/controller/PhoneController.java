package com.olam.crud.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PhoneController {

	
	@GetMapping(value="/phoneMessage")
	public ResponseEntity<String> message() {
		
		return new ResponseEntity<String>("hello vahid ", HttpStatus.OK);
		
	}
}
