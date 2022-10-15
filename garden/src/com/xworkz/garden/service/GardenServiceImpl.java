package com.xworkz.garden.service;

import com.xworkz.garden.dto.GardenDTO;
import com.xworkz.garden.repository.GardenRepository;
import com.xworkz.garden.repository.GardenRepositoryImpl;

public class GardenServiceImpl implements GardenService {

	@Override
	public boolean validateAndSave(GardenDTO dto) {
		String name = dto.getName();
		String area = dto.getArea();
		String type = dto.getType();
		int since = dto.getSince();
		String city = dto.getCity();
		if (name != null && name.length() > 5 && name.length() < 50) {
			System.out.println("it is valid name");
			if (area != null && area.length() > 3 && area.length() < 50) {
				System.out.println("it is valid area name");
				if (type != null && type.length() > 3 && type.length() < 50) {
					System.out.println("it is valid type");
					if (since > 1999 && since < 2022) {
						System.out.println("it is valid year");
						if (city != null && city.length() > 3 && city.length() < 50) {
							System.out.println("city is valid");
							GardenRepository gardenRepository = new GardenRepositoryImpl();
							gardenRepository.save(dto);
						} else {
							System.err.println("city is not valid");
						}
					} else {
						System.err.println("year is not valid");
					}
				} else {
					System.err.println("type is not valid");
				}
			} else {
				System.err.println("area name is not valid");
			}
		} else {
			System.err.println("name is not valid");
		}
		return false;
	}

}
