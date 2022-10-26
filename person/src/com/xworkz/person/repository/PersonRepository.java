package com.xworkz.person.repository;

import com.xworkz.person.dto.PersonDTO;

public interface PersonRepository {
	
	boolean save(PersonDTO dto);

	void displayAll();
	
	void displayAllAgeGreaterThanOrderByName(int age);
	
	void displayAllGenderDescOrderByName(char gender);
	
	void displayAllSalaryGreaterThanorderByDesc(double salary);
	
	void displayCount();
	
	void displaySumOfSalary();

}
