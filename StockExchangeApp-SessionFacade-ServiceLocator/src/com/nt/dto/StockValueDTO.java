package com.nt.dto;

import java.io.Serializable;
import java.util.Date;

public class StockValueDTO implements Serializable {
	private  float stockValue;
	private  float baseValue;
	private  Date  listedDate;
	private  int  stockCount;
	public float getStockValue() {
		return stockValue;
	}
	public void setStockValue(float stockValue) {
		this.stockValue = stockValue;
	}
	public float getBaseValue() {
		return baseValue;
	}
	public void setBaseValue(float baseValue) {
		this.baseValue = baseValue;
	}
	public Date getListedDate() {
		return listedDate;
	}
	public void setListedDate(Date listedDate) {
		this.listedDate = listedDate;
	}
	public int getStockCount() {
		return stockCount;
	}
	public void setStockCount(int stockCount) {
		this.stockCount = stockCount;
	}

}
