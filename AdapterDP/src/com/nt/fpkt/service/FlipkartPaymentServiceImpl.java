package com.nt.fpkt.service;

import com.nt.adapter.PayPalPaymentDetailsAdapter;
import com.nt.vo.PaymentDetailsVO;

public class FlipkartPaymentServiceImpl implements FlipkartPaymentService {

	@Override
	public String processPayment(PaymentDetailsVO vo) {
		String result=null;
		//use adapter
		result=PayPalPaymentDetailsAdapter.payAmount(vo);
		return result;
	}

}
