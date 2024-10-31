package com.iyzico.sandbox;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(IyzicoConfig.class)
public class IyzicoTestSandboxApplication {

	public static void main(String[] args) {
		SpringApplication.run(IyzicoTestSandboxApplication.class, args);
	}

}
