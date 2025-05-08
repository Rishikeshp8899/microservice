package com.richim.currency_exchange_service.contr;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.richim.currency_exchange_service.bean.CurrencyExchange;
import com.richim.currency_exchange_service.repository.CurrencyExchangeRepository;

@RestController
public class CurrencyExchangeController {
	
	@Autowired
	private CurrencyExchangeRepository repository;
	
	@Autowired
	private Environment env;

	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public CurrencyExchange CurrencyExchangeController 
(@PathVariable String from,@PathVariable String to) {
		CurrencyExchange currencyExchange=repository.findByFromAndTo(from, to);
		if(currencyExchange==null) {
			throw new RuntimeException("Unable to find data for: "+from+" to:"+to);
		}
		
		currencyExchange.setEnvironment(env.getProperty("local.server.port"));
		
		return currencyExchange;
	}
}
