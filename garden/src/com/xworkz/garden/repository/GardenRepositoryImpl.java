package com.xworkz.garden.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.garden.MySqlGardenCredentials;
import com.xworkz.garden.dto.GardenDTO;

public class GardenRepositoryImpl implements GardenRepository {

	@Override
	public boolean save(GardenDTO dto) {
		System.out.println("Garden is saved " + dto);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection(MySqlGardenCredentials.URL.getValue(),
					MySqlGardenCredentials.USERNAME.getValue(), MySqlGardenCredentials.SECRET.getValue());
			String sql = "insert into garden value('" + dto.getName() + "','" + dto.getArea() + "','" + dto.getType()
					+ "'," + dto.getSince() + ",'" + dto.getCity() + "')";
			Statement createStatement = connection.createStatement();
			System.out.println("Garden DB is saved : " + sql);
			int executeUpdate = createStatement.executeUpdate(sql);
			if (executeUpdate > 0) {
				System.out.println(executeUpdate);
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}

}
