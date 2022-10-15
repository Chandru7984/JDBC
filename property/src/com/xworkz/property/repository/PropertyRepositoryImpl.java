package com.xworkz.property.repository;

import com.xworkz.property.dto.PropertyDTO;

public class PropertyRepositoryImpl implements PropertyRepository {

	@Override
	public boolean save(PropertyDTO dto) {
		System.out.println("Property is saved " + dto);
		return false;
	}

}
