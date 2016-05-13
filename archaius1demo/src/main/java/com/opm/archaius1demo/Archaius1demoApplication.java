package com.opm.archaius1demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;


@SpringBootApplication
@EnableConfigServer
public class Archaius1demoApplication {

	public static void main(String[] args) {
		SpringApplication.run(Archaius1demoApplication.class, args);
	}
}
