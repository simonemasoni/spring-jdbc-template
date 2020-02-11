package com.gen.config;

public class DBConfig {

	private String username;
	private String password;

	public DBConfig(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

}
