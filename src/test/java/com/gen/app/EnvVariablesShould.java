package com.gen.app;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.gen.config.AppConfig;
import com.gen.config.DBConfig;

public class EnvVariablesShould {

	@Test
	public void be_injected_in_the_configuration() {
		System.setProperty("test.db.username", "testUsername");
		System.setProperty("test.db.password", "testPassword");
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		DBConfig dbConfig = ctx.getBean(DBConfig.class);
		
		assertEquals("testUsername", dbConfig.getUsername());
		assertEquals("testPassword", dbConfig.getPassword());
		
	}
	
}
