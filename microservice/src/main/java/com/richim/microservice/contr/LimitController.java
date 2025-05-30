package com.richim.microservice.contr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.richim.microservice.bean.Limits;
import com.richim.microservice.config.Configuration;

@RestController
public class LimitController {

	@Autowired
	private Configuration configuration;
	
	@GetMapping("/limits")
	public Limits retrievelLimits() {
		return new Limits(configuration.getMinimum(),configuration.getMaximum());
	}
}
