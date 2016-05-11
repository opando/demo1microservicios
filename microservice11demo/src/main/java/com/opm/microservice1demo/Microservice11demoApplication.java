package com.opm.microservice1demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@Configuration
@ComponentScan("com.opm.microservice1demo")
@EnableAutoConfiguration
@SpringBootApplication
@EnableDiscoveryClient
public class Microservice11demoApplication {

	public static void main(String[] args) {
		SpringApplication.run(Microservice11demoApplication.class, args);
	}
}
