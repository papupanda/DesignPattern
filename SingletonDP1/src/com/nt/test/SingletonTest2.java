package com.nt.test;

public class SingletonTest2 {

	public static void main(String[] args) {
		Thread th1=null,th2=null,th3=null,th4=null;
		TicketBookingServlet servlet=null;
		
		servlet=new TicketBookingServlet();
		th1=new Thread(servlet);
		th2=new Thread(servlet);
		th3=new Thread(servlet);
		th4=new Thread(servlet);
		
		
		th1.start();
		th2.start();
		th3.start();
		th4.start();

	}

}
