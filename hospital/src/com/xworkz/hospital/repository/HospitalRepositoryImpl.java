package com.xworkz.hospital.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.hospital.connection.MySqlDBCredentials;
import com.xworkz.hospital.dto.HospitalDTO;

public class HospitalRepositoryImpl implements HospitalRepository {

	@Override
	public boolean save(HospitalDTO dto) {
		System.out.println("data is saved" + dto);

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection(MySqlDBCredentials.URL.getValue(),
					MySqlDBCredentials.USERNAME.getValue(), MySqlDBCredentials.SECRET.getValue());
			String sql = "insert into hospital values(" + dto.getId() + ",'" + dto.getName() + "','"
					+ dto.getSpecialist() + "','" + dto.getFounder() + "'," + dto.getSince() + ")";
			Statement statement = connection.createStatement();
			System.out.println("Hospital values saved :" + sql);
			int executeUpdate = statement.executeUpdate(sql);

			if (executeUpdate > 0) {
				System.out.println(executeUpdate);
				return true;
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return true;
	}

}
