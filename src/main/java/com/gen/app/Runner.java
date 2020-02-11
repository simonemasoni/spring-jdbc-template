package com.gen.app;

import org.springframework.jdbc.core.JdbcTemplate;

public class Runner {

	private JdbcTemplate template;

	public Runner(JdbcTemplate template) {
		this.template = template;
		
	}

	public void run() {
		System.out.println("Now execute the queries with the template " + template);
	}
	
	
}
