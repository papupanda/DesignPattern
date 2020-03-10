package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.SingleThreadModel;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nt.singleton.Printer;



@WebServlet("/testurl")
public class TestServlet extends HttpServlet implements SingleThreadModel {
	
	
	
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("TestServlet:: doGet(-,-) (from servlet)");
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		try {
			Printer p1=Printer.getInstance();
			pw.println("hash Code::"+p1.hashCode());
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("TestServlet:: doPost(-,-)");
		doGet(req,res);
	}
	
	

}
