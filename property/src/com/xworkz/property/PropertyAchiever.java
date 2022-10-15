package com.xworkz.property;

import com.xworkz.property.dto.PropertyDTO;
import com.xworkz.property.service.PropertyService;
import com.xworkz.property.service.PropertyServiceImpl;

public class PropertyAchiever {

	public static void main(String[] args) {

		PropertyDTO propertyDTO = new PropertyDTO("Suresh", "Heritage", "Bengaluru", 20000000, 1000);

		PropertyService propertyService = new PropertyServiceImpl();
		propertyService.validateAndSave(propertyDTO);

	}

}
