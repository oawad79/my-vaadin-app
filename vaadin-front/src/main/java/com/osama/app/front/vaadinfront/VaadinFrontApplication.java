package com.osama.app.front.vaadinfront;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.osama.app.backend.service"})
public class VaadinFrontApplication {

	public static void main(String[] args) {
		SpringApplication.run(VaadinFrontApplication.class, args);
	}
}
