package com.xworkz.property.correction;

public enum MySqlDBGarageCredentials {
	
	URL("jdbc:mysql://localhost:3306/JDBC"), USERNAME("root"), SECRET("root");

	private String value;

	private MySqlDBGarageCredentials(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}


}
