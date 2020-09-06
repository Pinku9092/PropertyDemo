package com.pinku.propertyread.PropertyDemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pinku.propertyread.PropertyDemo.bean.PropertyResponse;
import com.pinku.propertyread.PropertyDemo.config.Configuration;

@RestController
public class PropertyController {

	@Autowired
	Configuration configurationProperties;
	
	@GetMapping("/readProperty")
	public PropertyResponse readProperty() {
		return new PropertyResponse(configurationProperties.getMinimum(), configurationProperties.getMaximum());
	}
}
