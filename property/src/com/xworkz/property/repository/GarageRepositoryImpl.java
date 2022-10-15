package com.xworkz.property.repository;

import com.xworkz.property.dto.GarageDTO;

public class GarageRepositoryImpl implements GarageRepository {

	@Override
	public boolean save(GarageDTO dto) {
		System.out.println("Garage is saved " + dto);
		return false;
	}

}
