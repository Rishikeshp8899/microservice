package com.richim.currency_conversion_service.contoller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.richim.currency_conversion_service.bean.CurrencyConversion;

//@FeignClient(name = "currency-exchange-service", url = "http://127.0.0.1:7001") before eureka register
@FeignClient(name = "currency-exchange-service")
public interface CurrencyExchangeProxy {
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public CurrencyConversion CurrencyExchangeController(@PathVariable String from, @PathVariable String to);
}
