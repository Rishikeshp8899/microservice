package com.richim.currency_exchange_service.contr;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.richim.currency_exchange_service.bean.CurrencyExchange;

@RestController
public class CurrencyExchangeController {
	
	@Autowired
	private Environment env;

	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public CurrencyExchange retriveExchangeValue(@PathVariable String from,@PathVariable String to) {
		return new CurrencyExchange(1L,"usd","inr",BigDecimal.ONE,env.getProperty("local.server.port"));
	}
}
