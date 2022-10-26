package com.xworkz.person.connection;

public enum MySqlDBPersonCredentials {
	
	Driver("com.mysql.cj.jdbc.Driver"),URL("jdbc:mysql://localhost:3306/JDBC"), USERNAME("root"), SECRET("root");
	
	private String value;

	private MySqlDBPersonCredentials(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}

}
