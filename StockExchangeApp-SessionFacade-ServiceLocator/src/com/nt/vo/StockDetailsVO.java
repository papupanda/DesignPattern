package com.nt.vo;

public class StockDetailsVO {
	private String stockName;
	private String exchangeName;
	private String stockId;
	private String stockValue;
	private String futureValue;
	private String companyName;
	private String listedDate;
	private String stockCount;
	private String basePrice;
	private String variationRate;

	public String getVariationRate() {
		return variationRate;
	}

	public void setVariationRate(String variationRate) {
		this.variationRate = variationRate;
	}

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

	public String getStockId() {
		return stockId;
	}

	public void setStockId(String stockId) {
		this.stockId = stockId;
	}

	public String getStockValue() {
		return stockValue;
	}

	public void setStockValue(String stockValue) {
		this.stockValue = stockValue;
	}

	public String getFutureValue() {
		return futureValue;
	}

	public void setFutureValue(String futureValue) {
		this.futureValue = futureValue;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getListedDate() {
		return listedDate;
	}

	public void setListedDate(String listedDate) {
		this.listedDate = listedDate;
	}

	public String getStockCount() {
		return stockCount;
	}

	public void setStockCount(String stockCount) {
		this.stockCount = stockCount;
	}

	public String getBasePrice() {
		return basePrice;
	}

	public void setBasePrice(String basePrice) {
		this.basePrice = basePrice;
	}
}
