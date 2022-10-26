package com.xworkz.person.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static com.xworkz.person.connection.MySqlDBPersonCredentials.*;

import com.mysql.cj.jdbc.Driver;
import com.xworkz.person.connection.MySqlDBPersonCredentials;
import com.xworkz.person.dto.PersonDTO;

public class PersonRepositoryImpl implements PersonRepository {

	@Override
	public boolean save(PersonDTO dto) {

		try {
			Class.forName(Driver.getValue());
			Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(), SECRET.getValue());
			String sql = "insert into person values(" + dto.getId() + ",'" + dto.getName() + "','" + dto.getEmail()
					+ "'," + dto.getMobile() + ",'" + dto.getGender() + "','" + dto.getQualification() + "',"
					+ dto.getMarried() + "," + dto.getWorking() + ",'" + dto.getCompanyName() + "'," + dto.getSalary()
					+ "," + dto.getAge() + "," + dto.getExperience() + ",'" + dto.getLocation() + "','" + dto.getCity()
					+ "','" + dto.getState() + "','" + dto.getCountry() + "'," + dto.getAdhaarNo() + ",'"
					+ dto.getPanNo() + "'," + dto.getAlive() + "," + dto.getBankAccNo() + ")";
			Statement createStatement = connection.createStatement();
			System.out.println("Person details saved : " + sql);
			int executeUpdate = createStatement.executeUpdate(sql);

			if (executeUpdate > 0) {
				System.out.println(executeUpdate);
				return true;
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return true;
	}

	@Override
	public void displayAll() {

		try {
			Class.forName(Driver.getValue());
			Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(), SECRET.getValue());
			String read = "select * from person";
			Statement createStatement = connection.createStatement();
			ResultSet executeQuery = createStatement.executeQuery(read);
			while (executeQuery.next()) {
				int id = executeQuery.getInt(1);
				String name = executeQuery.getString(2);
				String email = executeQuery.getString(3);
				long mobile = executeQuery.getLong(4);
				String gender = executeQuery.getString(5);
				String qualification = executeQuery.getString(6);
				Boolean married = executeQuery.getBoolean(7);
				Boolean working = executeQuery.getBoolean(8);
				String companyName = executeQuery.getString(9);
				double salary = executeQuery.getDouble(10);
				int age = executeQuery.getInt(11);
				double experience = executeQuery.getDouble(12);
				String location = executeQuery.getString(13);
				String city = executeQuery.getString(14);
				String state = executeQuery.getString(15);
				String country = executeQuery.getString(16);
				long adhaarNo = executeQuery.getLong(17);
				String panNo = executeQuery.getString(18);
				Boolean alive = executeQuery.getBoolean(19);
				long bankAccNo = executeQuery.getLong(20);

				System.out.println(id + "" + name + "" + email + "" + mobile + "" + gender + "" + qualification + ""
						+ married + "" + working + "" + companyName + "" + salary + "" + age + "" + experience + ""
						+ location + "" + city + "" + state + "" + country + "" + adhaarNo + "" + panNo + "" + alive
						+ "" + bankAccNo);
			}

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void displayAllAgeGreaterThanOrderByName(int age) {

		try {
			Class.forName(Driver.getValue());
			Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(), SECRET.getValue());
			String byName = "select * from person where age > " + age + " order by name";
			Statement createStatement = connection.createStatement();
			ResultSet executeQuery = createStatement.executeQuery(byName);

			while (executeQuery.next()) {
				int id = executeQuery.getInt(1);
				String name = executeQuery.getString(2);
				String email = executeQuery.getString(3);
				long mobile = executeQuery.getLong(4);
				String gender = executeQuery.getString(5);
				String qualification = executeQuery.getString(6);
				Boolean married = executeQuery.getBoolean(7);
				Boolean working = executeQuery.getBoolean(8);
				String companyName = executeQuery.getString(9);
				double salary = executeQuery.getDouble(10);
				int age1 = executeQuery.getInt(11);
				double experience = executeQuery.getDouble(12);
				String location = executeQuery.getString(13);
				String city = executeQuery.getString(14);
				String state = executeQuery.getString(15);
				String country = executeQuery.getString(16);
				long adhaarNo = executeQuery.getLong(17);
				String panNo = executeQuery.getString(18);
				Boolean alive = executeQuery.getBoolean(19);
				long bankAccNo = executeQuery.getLong(20);

				System.out.println(id + "" + name + "" + email + "" + mobile + "" + gender + "" + qualification + ""
						+ married + "" + working + "" + companyName + "" + salary + "" + age1 + "" + experience + ""
						+ location + "" + city + "" + state + "" + country + "" + adhaarNo + "" + panNo + "" + alive
						+ "" + bankAccNo);

				System.out.println(name + " " + age1);
			}

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void displayAllGenderDescOrderByName(char gender) {

		try {
			Class.forName(Driver.getValue());
			Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(), SECRET.getValue());
			String byGender = "select * from person where gender = '" + gender + "' order by name desc";
			Statement createStatement = connection.createStatement();
			ResultSet executeQuery = createStatement.executeQuery(byGender);

			while (executeQuery.next()) {
				int id = executeQuery.getInt(1);
				String name = executeQuery.getString(2);
				String email = executeQuery.getString(3);
				long mobile = executeQuery.getLong(4);
				String gender1 = executeQuery.getString(5);
				String qualification = executeQuery.getString(6);
				Boolean married = executeQuery.getBoolean(7);
				Boolean working = executeQuery.getBoolean(8);
				String companyName = executeQuery.getString(9);
				double salary = executeQuery.getDouble(10);
				int age1 = executeQuery.getInt(11);
				double experience = executeQuery.getDouble(12);
				String location = executeQuery.getString(13);
				String city = executeQuery.getString(14);
				String state = executeQuery.getString(15);
				String country = executeQuery.getString(16);
				long adhaarNo = executeQuery.getLong(17);
				String panNo = executeQuery.getString(18);
				Boolean alive = executeQuery.getBoolean(19);
				long bankAccNo = executeQuery.getLong(20);

				System.out.println(id + "" + name + "" + email + "" + mobile + "" + gender1 + "" + qualification + ""
						+ married + "" + working + "" + companyName + "" + salary + "" + age1 + "" + experience + ""
						+ location + "" + city + "" + state + "" + country + "" + adhaarNo + "" + panNo + "" + alive
						+ "" + bankAccNo);

				System.out.println(name + " " + gender1);
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void displayAllSalaryGreaterThanorderByDesc(double salary) {

		try {
			Class.forName(Driver.getValue());
			Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(), SECRET.getValue());
			String bySalary = "select * from person where salary > " + salary + " order by salary desc";
			Statement createStatement = connection.createStatement();
			ResultSet executeQuery = createStatement.executeQuery(bySalary);

			while (executeQuery.next()) {
				int id = executeQuery.getInt(1);
				String name = executeQuery.getString(2);
				String email = executeQuery.getString(3);
				long mobile = executeQuery.getLong(4);
				String gender1 = executeQuery.getString(5);
				String qualification = executeQuery.getString(6);
				Boolean married = executeQuery.getBoolean(7);
				Boolean working = executeQuery.getBoolean(8);
				String companyName = executeQuery.getString(9);
				double salary1 = executeQuery.getDouble(10);
				int age1 = executeQuery.getInt(11);
				double experience = executeQuery.getDouble(12);
				String location = executeQuery.getString(13);
				String city = executeQuery.getString(14);
				String state = executeQuery.getString(15);
				String country = executeQuery.getString(16);
				long adhaarNo = executeQuery.getLong(17);
				String panNo = executeQuery.getString(18);
				Boolean alive = executeQuery.getBoolean(19);
				long bankAccNo = executeQuery.getLong(20);

				System.out.println(id + "" + name + "" + email + "" + mobile + "" + gender1 + "" + qualification + ""
						+ married + "" + working + "" + companyName + "" + salary1 + "" + age1 + "" + experience + ""
						+ location + "" + city + "" + state + "" + country + "" + adhaarNo + "" + panNo + "" + alive
						+ "" + bankAccNo);

				System.out.println(salary1);
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void displayCount() {

		try {
			Class.forName(Driver.getValue());
			Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(), SECRET.getValue());
			String count = "select count(*) from person ";
			Statement createStatement = connection.createStatement();
			ResultSet executeQuery = createStatement.executeQuery(count);

			while (executeQuery.next()) {
				int id = executeQuery.getInt(1);
				System.out.println(id);
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void displaySumOfSalary() {

		try {
			Class.forName(Driver.getValue());
			Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(), SECRET.getValue());
			String sumOfSalary = "select sum(salary) from person";
			Statement createStatement = connection.createStatement();
			ResultSet executeQuery = createStatement.executeQuery(sumOfSalary);

			while (executeQuery.next()) {
				double salary = executeQuery.getDouble(1);

				System.out.println(salary);
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

}
