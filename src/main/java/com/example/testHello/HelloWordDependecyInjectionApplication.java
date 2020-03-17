package com.example.testHello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class HelloWordDependecyInjectionApplication {

	public static void main(String[] args) {
		// making a context to call another class or DI
		ConfigurableApplicationContext context = SpringApplication.run(HelloWordDependecyInjectionApplication.class,
				args);
		CustomerDI c = context.getBean(CustomerDI.class);
		
		c.displayNew();
	}

}
