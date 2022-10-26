package com.xworkz.person.service;

import com.xworkz.person.dto.PersonDTO;
import com.xworkz.person.repository.PersonRepository;
import com.xworkz.person.repository.PersonRepositoryImpl;

public class PersonServiceImpl implements PersonService {

	PersonRepository person = new PersonRepositoryImpl();

	@Override
	public boolean validateAndSave(PersonDTO dto) {
		int id = dto.getId();
		String name = dto.getName();
		String email = dto.getEmail();
		long mobile = dto.getMobile();
		char gender = dto.getGender();
		String qualification = dto.getQualification();
		Boolean married = dto.getMarried();
		Boolean working = dto.getWorking();
		String companyName = dto.getCompanyName();
		double salary = dto.getSalary();
		int age = dto.getAge();
		double experience = dto.getExperience();
		String location = dto.getLocation();
		String city = dto.getCity();
		String state = dto.getState();
		String country = dto.getCountry();
		long adhaarNo = dto.getAdhaarNo();
		String panNo = dto.getPanNo();
		Boolean alive = dto.getAlive();
		long bankAccNo = dto.getBankAccNo();

		if (id > 0) {
			System.out.println("It is valid");
			if (name != null && name.length() > 2 && name.length() < 50) {
				System.out.println("name is valid");
				if (email != null && email.length() > 5 && email.length() < 50) {
					System.out.println("email is valid");
					if (mobile > 0) {
						System.out.println("mobile is valid");
						if (gender == 'M' || gender == 'F' || gender == 'O') {
							System.out.println("gender is valid");
							if (qualification != null) {
								System.out.println("qualification is valid");
								if (married == true || married == false) {
									System.out.println("married is valid");
									if (working == true || working == false) {
										System.out.println("working is valid");
										if (companyName != null) {
											System.out.println("Company Name is valid");
											if (salary > 0) {
												System.out.println("salary is valid");
												if (age > 20) {
													System.out.println("age is valid");
													if (experience >= 0 && experience < 40) {
														System.out.println("experience is valid");
														if (location != null) {
															System.out.println("location is valid");
															if (city != null) {
																System.out.println("city is valid");
																if (state != null) {
																	System.out.println("state is valid");
																	if (country != null) {
																		System.out.println("country is valid");
																		if (adhaarNo > 11) {
																			System.out.println("adhaar is valid");
																			if (panNo != null && panNo.length() > 9
																					&& panNo.length() < 11) {
																				System.out.println("pan is valid");
																				if (alive == true || alive == false) {
																					System.out
																							.println("alive is valid");
																					if (bankAccNo > 9) {
																						System.out.println(
																								"bank is valid");
																						person.save(dto);
																						person.displayAll();
																						person.displayAllAgeGreaterThanOrderByName(
																								age);
																						person.displayAllGenderDescOrderByName(
																								gender);
																						person.displayAllSalaryGreaterThanorderByDesc(
																								salary);
																						person.displayCount();
																						person.displaySumOfSalary();
																					} else {
																						System.err.println(
																								"bank is invalid");
																					}
																				} else {
																					System.err.println(
																							"alive is invalid");
																				}
																			} else {
																				System.err.println("pan is invalid");
																			}
																		} else {
																			System.err.println("adhaar is invalid");
																		}
																	} else {
																		System.err.println("country is invalid");
																	}
																} else {
																	System.err.println("state is invalid");
																}
															} else {
																System.err.println("city is invalid");
															}
														} else {
															System.err.println("location is invalid");
														}
													} else {
														System.err.println("experince is invalid");
													}
												} else {
													System.err.println("age is invalid");
												}
											} else {
												System.err.println("salary is invalid");
											}
										} else {
											System.err.println("Company Name is invalid");
										}
									} else {
										System.err.println("working is invalid");
									}
								} else {
									System.err.println("married is invalid");
								}
							} else {
								System.err.println("qualification is invalid");
							}
						} else {
							System.err.println("gender is invalid");
						}
					} else {
						System.err.println("mobile is invalid");
					}
				} else {
					System.err.println("email is invalid");
				}
			} else {
				System.err.println("name is invalid");
			}
		} else {
			System.err.println("It is invalid");
		}
		return false;
	}

	@Override
	public void displayAll() {
		System.out.println("Person details are Displayed");
		this.person.displayAll();
	}

	@Override
	public void displayAllAgeGreaterThanOrderByName(int age) {
		System.out.println("Display age by greater than");
		this.person.displayAllAgeGreaterThanOrderByName(age);
	}

	@Override
	public void displayAllGenderDescOrderByName(char gender) {
		System.out.println("Display gender desc order by name");
		this.person.displayAllGenderDescOrderByName(gender);

	}

	@Override
	public void displayAllSalaryGreaterThanorderByDesc(double salary) {
		System.out.println("Display salary by order");
		this.person.displayAllSalaryGreaterThanorderByDesc(salary);

	}

	@Override
	public void displayCount() {
		System.out.println("Display by count");
		this.person.displayCount();
	}

	@Override
	public void displaySumOfSalary() {
		System.out.println("Display sum of salary");
		this.person.displaySumOfSalary();
	}
}
