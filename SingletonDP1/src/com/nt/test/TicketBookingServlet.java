package com.nt.test;

import com.nt.singleton.Printer;

public class TicketBookingServlet implements Runnable {

	@Override
	public void run() {
		try {
		Printer p1=Printer.getInstance();
		System.out.println(p1.hashCode());
		}
		catch(InstantiationException ie) {
			ie.printStackTrace();
		}
	}

}
