package com.nt.adapter;

import com.nt.dto.CardDetails;
import com.nt.external.PayPalComp;
import com.nt.external.PayPalCompImpl;
import com.nt.vo.PaymentDetailsVO;

public class PayPalPaymentDetailsAdapter {
	
	public static  String   payAmount(PaymentDetailsVO vo) {
		  int bankCode=0,pgCode=0;
		  CardDetails details=null;
		  PayPalComp extComp=null;
		  String paymentStatus=null;
		//Convert BankNames to BankCode by taking to DBs/w
		  if(vo.getBankName().equalsIgnoreCase("ICICI"))
			  bankCode=1111;
		  else if(vo.getBankName().equalsIgnoreCase("SBI"))
			  bankCode=2222;
		  else if(vo.getBankName().equalsIgnoreCase("HDFC"))
			  bankCode=3333;
		  else
			  throw new IllegalArgumentException("Invalid Bank Name");
		  
		//Convert Payment Gateway Names to Payment Gateway Code by talking to DBs/w
		  if(vo.getPgName().equalsIgnoreCase("VISA"))
			  pgCode=11;
		  else if(vo.getPgName().equalsIgnoreCase("MASTER"))
			  pgCode=22;
		  else if(vo.getPgName().equalsIgnoreCase("MASTREAO"))
		      pgCode=33;
		  else 
			    throw new IllegalArgumentException("Invalind  Payment Gateway name");
		  //convert VO class obj  to DTO class obj
		    details=new CardDetails();
		    details.setCardNo(Integer.parseInt(vo.getCardNo()));
		    details.setBankCode(bankCode);
		    details.setPgCode(pgCode);
		    details.setAmount(Float.parseFloat(vo.getAmount()));
		  //use Extenal service 
		    extComp=PayPalCompImpl.getInstance();
		    paymentStatus=extComp.doPayment(details);
		   return paymentStatus;
	}

}
