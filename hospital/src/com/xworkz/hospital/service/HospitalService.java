package com.xworkz.hospital.service;

import com.xworkz.hospital.dto.HospitalDTO;

public interface HospitalService {

	boolean validateAndSave(HospitalDTO dto);
}
