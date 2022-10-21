package com.xworkz.hospital.connection;

public enum MySqlDBCredentials {

	URL("jdbc:mysql://localhost:3306/JDBC"), USERNAME("root"), SECRET("root");

	private String value;

	private MySqlDBCredentials(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
