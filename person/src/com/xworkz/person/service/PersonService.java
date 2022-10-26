package com.xworkz.person.service;

import com.xworkz.person.dto.PersonDTO;

public interface PersonService {

	boolean validateAndSave(PersonDTO dto);
	
	void displayAll();

	void displayAllAgeGreaterThanOrderByName(int age);

	void displayAllGenderDescOrderByName(char gender);

	void displayAllSalaryGreaterThanorderByDesc(double salary);

	void displayCount();

	void displaySumOfSalary();
}
