package com.xworkz.property.service;

import com.xworkz.property.dto.PropertyDTO;
import com.xworkz.property.repository.PropertyRepository;
import com.xworkz.property.repository.PropertyRepositoryImpl;

public class PropertyServiceImpl implements PropertyService {

	@Override
	public boolean validateAndSave(PropertyDTO dto) {
		String owner = dto.getOwner();
		String name = dto.getName();
		String city = dto.getCity();
		long price = dto.getPrice();
		int sqFeet = dto.getSqFeet();
		if (owner != null && owner.length() > 3 && owner.length() < 50) {
			System.out.println("it is valid");
			if (name != null && name.length() > 3 && name.length() < 50) {
				System.out.println("it is valid");
				if (city != null && city.length() > 5 && city.length() < 50) {
					System.out.println("it is valid");
					if (price > 5 && price < 30000000) {
						System.out.println("it is valid");
						if (sqFeet > 5 && sqFeet < 1100) {
							System.out.println("it is valid");
							PropertyRepository propertyRepository = new PropertyRepositoryImpl();
							propertyRepository.save(dto);
						} else {
							System.err.println("sqfeet is not valid");
						}
					} else {
						System.err.println("price is not valid");
					}
				} else {
					System.err.println("city is not valid");
				}
			} else {
				System.err.println("name is not valid");
			}
		} else {
			System.err.println("owner name not invalid");
		}
		return true;
	}

}
