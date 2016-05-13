package com.opm.hystrix1demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@EnableAutoConfiguration
@EnableHystrixDashboard
@ComponentScan
@EnableTurbine
public class Hystrix1demoApplication {

	public static void main(String[] args) {
		SpringApplication.run(Hystrix1demoApplication.class, args);
	}
}
