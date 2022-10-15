package com.xworkz.property.service;

import com.xworkz.property.dto.GarageDTO;
import com.xworkz.property.repository.GarageRepository;
import com.xworkz.property.repository.GarageRepositoryImpl;

public class GarageServiceImpl implements GarageService {

	@Override
	public boolean validateAndSave(GarageDTO dto) {
		String name = dto.getName();
		String owner = dto.getOwner();
		String type = dto.getType();
		String review = dto.getReview();
		int minServiceCost = dto.getMinServiceCost();
		if (name != null && name.length() > 3 && name.length() < 50) {
			System.out.println("it is valid");
			if (owner != null && owner.length() > 3 && owner.length() < 50) {
				System.out.println("it is valid");
				if (type != null && type.length() > 3 && type.length() < 50) {
					System.out.println("it is valid");
					if (review != null && review.length() > 3 && review.length() < 50) {
						System.out.println("it is valid");
						if (minServiceCost > 10 && minServiceCost < 400) {
							System.out.println("it is valid");
							GarageRepository garageRepository = new GarageRepositoryImpl();
							garageRepository.save(dto);
						} else {
							System.err.println("it is invalid");
						}
					} else {
						System.err.println("it is invalid");
					}
				} else {
					System.err.println("it is ivalid");
				}
			} else {
				System.err.println("it is invalid");
			}
		} else {
			System.err.println("it is invalid");
		}
		return false;
	}

}
