package com.xworkz.property.dto;

import lombok.Getter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class PropertyDTO {

	private String owner;
	private String name;
	private String city;
	private long price;
	private int sqFeet;

}
