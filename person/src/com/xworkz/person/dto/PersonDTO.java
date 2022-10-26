package com.xworkz.person.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class PersonDTO {

	private int id;
	private String name;
	private String email;
	private long mobile;
	private char gender;
	private String qualification;
	private Boolean married;
	private Boolean working;
	private String companyName;
	private double salary;
	private int age;
	private double experience;
	private String location;
	private String city;
	private String state;
	private String country;
	private long adhaarNo;
	private String panNo;
	private Boolean alive;
	private long bankAccNo;

}
