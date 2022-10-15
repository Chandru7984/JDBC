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
public class GarageDTO {

	private String name;
	private String owner;
	private String type;
	private String review;
	private int minServiceCost;
}
