package com.gen.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.gen.config.AppConfig;

public class Main {

	public static void main(String[] args) {		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);		
		Runner runner = ctx.getBean(Runner.class);
		runner.run();
	}
}
