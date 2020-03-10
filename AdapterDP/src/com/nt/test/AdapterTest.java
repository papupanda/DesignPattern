package com.nt.test;

import java.util.Scanner;

import com.nt.fpkt.service.FlipkartPaymentService;
import com.nt.fpkt.service.FlipkartPaymentServiceImpl;
import com.nt.vo.PaymentDetailsVO;

public class AdapterTest {

	public static void main(String[] args) {
		Scanner sc=null;
		String cardNo=null,bankName=null,pgName=null,amount=null;
		PaymentDetailsVO vo=null;
		FlipkartPaymentService service=null;
		//read inputs
		sc=new Scanner(System.in);
		System.out.println("Enter Card No::");
		cardNo=sc.next();
		System.out.println("Enter bank Name:");
		bankName=sc.next();
		System.out.println("Enter pg Name::");
		pgName=sc.next();
		System.out.println("Enter Amount::");
		amount=sc.next();
		//prepare VO class object
		vo=new PaymentDetailsVO();
		vo.setCardNo(cardNo);
		vo.setBankName(bankName);
		vo.setPgName(pgName);
		vo.setAmount(amount);
		//use Service
		service=new FlipkartPaymentServiceImpl();
		  //invoke methods
		System.out.println("status:::"+service.processPayment(vo));
	}
}
