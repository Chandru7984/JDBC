package com.xworkz.property;

import com.xworkz.property.dto.GarageDTO;
import com.xworkz.property.service.GarageService;
import com.xworkz.property.service.GarageServiceImpl;

public class GarageAchiever {

	public static void main(String[] args) {
		
		GarageDTO garageDTO = new GarageDTO("Guru Service", "Swamy", "Two wheeler", "Good", 350);
		
		GarageService garageService = new GarageServiceImpl();
		garageService.validateAndSave(garageDTO);

	}

}
