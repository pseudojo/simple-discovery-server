package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer        // included Ribbon client
public class SimpleDiscoveryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleDiscoveryServerApplication.class, args);
	}
}
