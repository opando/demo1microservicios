package com.opm.zuul1demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.web.ErrorMvcAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
@EnableAutoConfiguration(exclude = {ErrorMvcAutoConfiguration.class})
@EnableDiscoveryClient
@EnableZuulProxy
public class Zuul1demoApplication {

	public static void main(String[] args) {
		SpringApplication.run(Zuul1demoApplication.class, args);
	}
}
