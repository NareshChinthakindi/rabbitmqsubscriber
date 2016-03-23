package org.naresh.javariders;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * This is spring boot application where it will load all the configuration values 
 * and resolve the dependency injection
 *
 */
@ComponentScan("org.naresh")
@SpringBootApplication
public class RabbitMQApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(RabbitMQApplication.class, args);
		
				
	}
}
