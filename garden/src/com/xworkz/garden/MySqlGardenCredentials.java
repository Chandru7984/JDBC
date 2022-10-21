package com.xworkz.garden;

public enum MySqlGardenCredentials {

	URL("jdbc:mysql://localhost:3306/JDBC"), USERNAME("root"), SECRET("root");

	private String value;

	MySqlGardenCredentials(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

}
