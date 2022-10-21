package com.xworkz.garden.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.garden.MySqlGardenCredentials;
import com.xworkz.garden.dto.ProjectorDTO;

public class ProjectorRepositoryImpl implements ProjectorRepository {

	@Override
	public boolean save(ProjectorDTO dto) {
		System.out.println("Projector is saved " + dto);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection(MySqlGardenCredentials.URL.getValue(),
					MySqlGardenCredentials.USERNAME.getValue(), MySqlGardenCredentials.SECRET.getValue());
			String sql = "insert into projector values('" + dto.getBrand() + "'," + dto.getDistance() + ","
					+ dto.getLampLife() + ",'" + dto.getType() + "','" + dto.getModel() + "')";
			Statement createStatement = connection.createStatement();
			System.out.println("Projector DB saved : " + sql);
			int executeUpdate = createStatement.executeUpdate(sql);

			if (executeUpdate > 0) {
				System.out.println(executeUpdate);
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return true;
	}

}
