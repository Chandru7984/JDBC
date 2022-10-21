package com.xworkz.property.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.property.correction.MySqlDBGarageCredentials;
import com.xworkz.property.dto.GarageDTO;

public class GarageRepositoryImpl implements GarageRepository {

	@Override
	public boolean save(GarageDTO dto) {
		System.out.println("Garage is saved " + dto);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection(MySqlDBGarageCredentials.URL.getValue(),
					MySqlDBGarageCredentials.USERNAME.getValue(), MySqlDBGarageCredentials.SECRET.getValue());
			String sql = "insert into garege values('" + dto.getName() + "','" + dto.getOwner() + "','" + dto.getType()
					+ "','" + dto.getReview() + "'," + dto.getMinServiceCost() + ")";
			Statement createStatement = connection.createStatement();
			System.out.println("Garage DB saved : " + sql);
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
