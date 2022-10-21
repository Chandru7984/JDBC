package com.xworkz.hospital.service;

import com.xworkz.hospital.dto.HospitalDTO;
import com.xworkz.hospital.repository.HospitalRepository;
import com.xworkz.hospital.repository.HospitalRepositoryImpl;

public class HospitalServiceImpl implements HospitalService {

	@Override
	public boolean validateAndSave(HospitalDTO dto) {
		int id = dto.getId();
		String name = dto.getName();
		String founder = dto.getFounder();
		String specialist = dto.getSpecialist();
		int since = dto.getSince();
		if (id > 0 && id < 100) {
			System.out.println("it is valid");
			if (name != null && name.length() > 3 && name.length() < 50) {
				System.out.println("it is valid");
				if (founder != null && founder.length() > 2 && founder.length() < 50) {
					System.out.println("it is valid");
					if (specialist != null && specialist.length() > 2 && specialist.length() < 50) {
						System.out.println("it is valid");
						if (since > 1900 && since < 2022) {
							System.out.println("it is valid");
							HospitalRepository hospitalRepository = new HospitalRepositoryImpl();
							hospitalRepository.save(dto);
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
		return false;
	}

}
