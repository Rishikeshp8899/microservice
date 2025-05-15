package com.richim.currency_conversion_service.contoller;

import java.math.BigDecimal;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.richim.currency_conversion_service.bean.CurrencyConversion;

@RestController
public class CurrencyController {

	@Autowired
	private Environment env;
	
	@GetMapping("/currency-conversion/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversion calculateConversion(@PathVariable String from,@PathVariable String to,@PathVariable String  quantity) {
		
		HashMap<String,String> uriVariables=new HashMap<>();
		
		uriVariables.put("to",to);
		uriVariables.put("from", from);
		uriVariables.put("quantity", quantity);
		
		ResponseEntity<CurrencyConversion> responseEntity =new RestTemplate().getForEntity("http://127.0.0.1:7001/currency-exchange/from/{from}/to/{to}", CurrencyConversion.class,uriVariables);
		
		return new CurrencyConversion(responseEntity.getBody().getId(),from,to,responseEntity.getBody().getQauntity(),responseEntity.getBody().getConversionMultiple(),BigDecimal.valueOf(Integer.parseInt(quantity)*responseEntity.getBody().getConversionMultiple().intValue()),env.getProperty("local.server.port"));
	}
}
