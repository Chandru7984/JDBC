package com.xworkz.garden.dto;

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

public class GardenDTO {

	private String name;
	private String area;
	private String type;
	private int since;
	private String city;

}
