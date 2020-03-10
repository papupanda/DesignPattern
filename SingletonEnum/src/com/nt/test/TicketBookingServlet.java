package com.nt.test;

import com.nt.singleton.Printer;

public class TicketBookingServlet implements Runnable {

	@Override
	public void run() {
		Printer p1=Printer.INSTANCE;
		System.out.println(p1.hashCode());
	}

}
