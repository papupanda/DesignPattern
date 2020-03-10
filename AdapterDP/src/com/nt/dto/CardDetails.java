package com.nt.dto;

import java.io.Serializable;

public class CardDetails implements Serializable{
	private int cardNo;
	private int pgCode;
	private int bankCode;
	private float amount;
	
	public int getCardNo() {
		return cardNo;
	}
	public void setCardNo(int cardNo) {
		this.cardNo = cardNo;
	}
	public int getPgCode() {
		return pgCode;
	}
	public void setPgCode(int pgCode) {
		this.pgCode = pgCode;
	}
	public int getBankCode() {
		return bankCode;
	}
	public void setBankCode(int bankCode2) {
		this.bankCode = bankCode2;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	
	
	

}
