package com.nt.external;

import com.nt.dto.CardDetails;

public class PayPalCompImpl implements PayPalComp {
	private  static  PayPalComp   instance;
	static {
		instance=new PayPalCompImpl();
	}
	
	public static  PayPalComp  getInstance() {
		 return  instance;
	}

	@Override
	public String doPayment(CardDetails details) {
		return  details.getAmount()+" payment is done for Card number "+details.getCardNo()+" belonging to bankCode"+details.getBankCode()+" with  PgCode"+details.getPgCode(); 
	}

}
