package com.assigment3.vaccination.vaccination;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class VaccinationDriveApplication extends SpringBootServletInitializer {
	
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(VaccinationDriveApplication.class);
	}
	public static void main(String[] args) {
		SpringApplication.run(VaccinationDriveApplication.class, args);
	}

}
