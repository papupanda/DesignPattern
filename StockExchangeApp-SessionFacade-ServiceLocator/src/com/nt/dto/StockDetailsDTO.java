package com.nt.dto;

import java.io.Serializable;
import java.util.Date;

public class StockDetailsDTO implements  Serializable {
	private String stockName;
	private String exchangeName;
	private int stockId;
	private float stockValue;
	private float futureValue;
	private String companyName;
	private Date listedDate;
	private int stockCount;
	private float basePrice;
	private float  variationRate;
	
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
	public int getStockId() {
		return stockId;
	}
	public void setStockId(int stockId) {
		this.stockId = stockId;
	}
	public float getStockValue() {
		return stockValue;
	}
	public void setStockValue(float stockValue) {
		this.stockValue = stockValue;
	}
	public float getFutureValue() {
		return futureValue;
	}
	public void setFutureValue(float futureValue) {
		this.futureValue = futureValue;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
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
	public float getBasePrice() {
		return basePrice;
	}
	public void setBasePrice(float basePrice) {
		this.basePrice = basePrice;
	}
	public float getVariationRate() {
		return variationRate;
	}
	public void setVariationRate(float variationRate) {
		this.variationRate = variationRate;
	}

	}
