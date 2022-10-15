package com.xworkz.garden;

import com.xworkz.garden.dto.ProjectorDTO;
import com.xworkz.garden.service.ProjectorService;
import com.xworkz.garden.service.ProjectorServiceImpl;

public class ProjectorAchiever {

	public static void main(String[] args) {

		ProjectorDTO projectorDTO = new ProjectorDTO("BenQ", 40, 15000, "XGA", "EX600");

		ProjectorService projectorService = new ProjectorServiceImpl();
		projectorService.validateAndSave(projectorDTO);

	}

}
