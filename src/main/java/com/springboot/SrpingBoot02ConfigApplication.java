package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(locations = {"classpath:beans.xml"})
public class SrpingBoot02ConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(SrpingBoot02ConfigApplication.class, args);
	}

}
