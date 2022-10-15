package com.xworkz.property.service;

import com.xworkz.property.dto.GarageDTO;

public interface GarageService {

	boolean validateAndSave(GarageDTO dto);
}
