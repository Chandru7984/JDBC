package com.xworkz.garden;

import com.xworkz.garden.dto.GardenDTO;
import com.xworkz.garden.service.GardenService;
import com.xworkz.garden.service.GardenServiceImpl;

public class GardenAchiever {

	public static void main(String[] args) {

		GardenDTO gardenDTO = new GardenDTO("KR park", "Basavanagudi", "Flower garden", 2000, "Bengaluru");

		GardenService gardenService = new GardenServiceImpl();
		gardenService.validateAndSave(gardenDTO);
	}

}
