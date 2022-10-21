package com.xworkz.property.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.property.correction.MySqlDBGarageCredentials;
import com.xworkz.property.dto.PropertyDTO;

public class PropertyRepositoryImpl implements PropertyRepository {

	@Override
	public boolean save(PropertyDTO dto) {
		System.out.println("Property is saved " + dto);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection(MySqlDBGarageCredentials.URL.getValue(),
					MySqlDBGarageCredentials.USERNAME.getValue(), MySqlDBGarageCredentials.SECRET.getValue());
			String sql = "insert into property values('" + dto.getOwner() + "','" + dto.getName() + "','"
					+ dto.getCity() + "'," + dto.getPrice() + "," + dto.getSqFeet() + ")";
			Statement createStatement = connection.createStatement();
			System.out.println("Property DB saved : " + sql);
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
