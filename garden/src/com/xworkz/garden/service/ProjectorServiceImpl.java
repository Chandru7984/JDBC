package com.xworkz.garden.service;

import com.xworkz.garden.dto.ProjectorDTO;
import com.xworkz.garden.repository.ProjectorRepository;
import com.xworkz.garden.repository.ProjectorRepositoryImpl;

public class ProjectorServiceImpl implements ProjectorService {

	@Override
	public boolean validateAndSave(ProjectorDTO dto) {
		String brand = dto.getBrand();
		int distance = dto.getDistance();
		int lampLife = dto.getLampLife();
		String type = dto.getType();
		String model = dto.getModel();
		if (brand != null && brand.length() > 3 && brand.length() < 30) {
			System.out.println("it is valid");
			if (distance > 10 && distance < 50) {
				System.out.println("it is valid");
				if (lampLife > 10000 && lampLife < 16000) {
					System.out.println("it is valid");
					if (type != null && type.length() > 2 && type.length() < 5) {
						System.out.println("it is valid");
						if (model != null && model.length() > 3 && model.length() < 10) {
							System.out.println("it is valid");
							ProjectorRepository projectorRepository = new ProjectorRepositoryImpl();
							projectorRepository.save(dto);
						} else {
							System.err.println("it is invalid");
						}
					} else {
						System.err.println("it is invalid");
					}
				} else {
					System.err.println("it is invalid");
				}
			} else {
				System.err.println("it is invalid");
			}
		} else {
			System.err.println("it is invalid");
		}
		return true;
	}

}
