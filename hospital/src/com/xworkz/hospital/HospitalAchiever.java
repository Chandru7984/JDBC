package com.xworkz.hospital;

import com.xworkz.hospital.dto.HospitalDTO;
import com.xworkz.hospital.service.HospitalService;
import com.xworkz.hospital.service.HospitalServiceImpl;

public class HospitalAchiever {

	public static void main(String[] args) {
		
		HospitalDTO hospitalDTO = new HospitalDTO(48496, "Jay Deva", "C N Manjunath", "Cardiac", 1972);

		HospitalService hospitalService = new HospitalServiceImpl();
		hospitalService.validateAndSave(hospitalDTO);
	}

}
