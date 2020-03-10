package com.nt.dto;

import java.io.Serializable;

public class StockInputsDTO implements Serializable{
	private String stockName;
	private  String exchangeName;
	
	public String getStockName() {
		return stockName;
	}
	public void setStockName(String stockName) {
		this.stockName = stockName;
	}
	public String getExchangeName() {
		return exchangeName;
	}
	public void setExchangeName(String exchangeName) {
		this.exchangeName = exchangeName;
	}

}
