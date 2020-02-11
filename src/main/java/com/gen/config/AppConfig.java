package com.gen.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import com.gen.app.Runner;
import com.mchange.v2.c3p0.ComboPooledDataSource;

@Configuration
public class AppConfig {

	@Value("${test.db.username}")
	private String username;

	@Value("${test.db.password}")
	private String password;

	@Bean
	public Runner getRunner() throws Exception {
		return new Runner(new JdbcTemplate(getDataSource()));
	}

	@Bean
	public DataSource getDataSource() throws Exception {
		ComboPooledDataSource dataSource = new ComboPooledDataSource();
		dataSource.setDriverClass("");
		dataSource.setJdbcUrl("");
		dataSource.setUser(username);
		dataSource.setPassword(password);
		dataSource.setInitialPoolSize(5);
		return dataSource;
	}

	@Bean
	public DBConfig getDBConfig() {
		return new DBConfig(username, password);
	}
	
}
