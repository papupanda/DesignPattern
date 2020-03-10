package com.nt.dto;

import java.io.Serializable;

public class StockIdDetailsDTO implements Serializable {
	private  int stockId;
	private  String company;
	public int getStockId() {
		return stockId;
	}
	public void setStockId(int stockId) {
		this.stockId = stockId;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}

}
