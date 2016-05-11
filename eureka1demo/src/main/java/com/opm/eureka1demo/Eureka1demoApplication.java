package com.opm.eureka1demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@SpringBootApplication
@EnableEurekaServer
public class Eureka1demoApplication {

	public static void main(String[] args) {
		
		//SpringApplication.run(Eureka1demoApplication.class, args);
		new SpringApplicationBuilder(Eureka1demoApplication.class).web(true).run(args);
	}
}
