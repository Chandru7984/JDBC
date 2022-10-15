package com.xworkz.garden.service;

import com.xworkz.garden.dto.GardenDTO;

public interface GardenService {

	boolean validateAndSave(GardenDTO dto);
}
