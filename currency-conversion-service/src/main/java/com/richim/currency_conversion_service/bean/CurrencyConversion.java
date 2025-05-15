package com.richim.currency_conversion_service.bean;

import java.math.BigDecimal;

public class CurrencyConversion {

	private Long id;
	private String from;
	private String to;
	private BigDecimal qauntity;
	private BigDecimal conversionMultiple;
	private BigDecimal totalCalculatedAmount;
	private String enviroment;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public BigDecimal getQauntity() {
		return qauntity;
	}
	public void setQauntity(BigDecimal qauntity) {
		this.qauntity = qauntity;
	}
	public BigDecimal getConversionMultiple() {
		return conversionMultiple;
	}
	public void setConversionMultiple(BigDecimal conversionMultiple) {
		this.conversionMultiple = conversionMultiple;
	}
	public BigDecimal getTotalCalculatedAmount() {
		return totalCalculatedAmount;
	}
	public void setTotalCalculatedAmount(BigDecimal totalCalculatedAmount) {
		this.totalCalculatedAmount = totalCalculatedAmount;
	}
	public String getEnviroment() {
		return enviroment;
	}
	public void setEnviroment(String enviroment) {
		this.enviroment = enviroment;
	}
	public CurrencyConversion(Long id, String from, String to, BigDecimal qauntity, BigDecimal conversionMultiple,
			BigDecimal totalCalculatedAmount, String enviroment) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.qauntity = qauntity;
		this.conversionMultiple = conversionMultiple;
		this.totalCalculatedAmount = totalCalculatedAmount;
		this.enviroment = enviroment;
	}
	public CurrencyConversion(){}
	
}
