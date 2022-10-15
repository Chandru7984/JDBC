package com.xworkz.garden.repository;

import com.xworkz.garden.dto.ProjectorDTO;

public class ProjectorRepositoryImpl implements ProjectorRepository {

	@Override
	public boolean save(ProjectorDTO dto) {
		System.out.println("Projector is saved " + dto);
		return false;
	}

}
