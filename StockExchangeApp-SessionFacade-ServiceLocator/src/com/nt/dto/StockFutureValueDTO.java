package com.nt.dto;

import java.io.Serializable;

public class StockFutureValueDTO implements Serializable {
	private float  futureValue;
	private  float  variationRate;
	public float getFutureValue() {
		return futureValue;
	}
	public void setFutureValue(float futureValue) {
		this.futureValue = futureValue;
	}
	public float getVariationRate() {
		return variationRate;
	}
	public void setVariationRate(float variationRate) {
		this.variationRate = variationRate;
	}

}
