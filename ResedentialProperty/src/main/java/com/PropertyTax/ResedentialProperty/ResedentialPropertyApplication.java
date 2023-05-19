package com.PropertyTax.ResedentialProperty;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.PropertyTax.ResedentialProperty.Entity.UnitAreaValue;
import com.PropertyTax.ResedentialProperty.Service.UnitAreaValueService;

@SpringBootApplication
public class ResedentialPropertyApplication {
	
	@Autowired
	public UnitAreaValueService unitAreaService;

	public static void main(String[] args) {
		SpringApplication.run(ResedentialPropertyApplication.class, args);
	}

	
	@Bean
	public UnitAreaValue valuesOnInstantiation() {
		return unitAreaService.defaultUnitAreaValueSetup();
	}
	
}
