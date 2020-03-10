package com.nt.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nt.delegate.StockDetailsFinderBusinessDelegate;
import com.nt.dto.StockDetailsDTO;
import com.nt.vo.StockDetailsVO;
import com.nt.vo.StockInputsVO;

@WebServlet("/controller")
public class MainControllerServlet extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		  String  stockName=null,exchangeName=null;
		  StockDetailsFinderBusinessDelegate delegate=null;
		  StockInputsVO ipVO=null;
		  StockDetailsVO fullVO=null;
		  RequestDispatcher rd=null;
		//read form ata
		  stockName=req.getParameter("stockName");
		  exchangeName=req.getParameter("exchange");
		  //prepare InputsVO class object
		  ipVO=new StockInputsVO();
		  ipVO.setStockName(stockName);
		  ipVO.setExchangeName(exchangeName);
		  try {
		  //create BusinessDelegate class object
		  delegate=new StockDetailsFinderBusinessDelegate();
		  //invoke the method
		  fullVO=delegate.fetchStockDetailsByNickName(ipVO);
		  // keep fullVO in request scope
		  req.setAttribute("stockDetails",fullVO);
		  //forward request to jsp page
		  rd=req.getRequestDispatcher("/display_stock_details.jsp");
		  rd.forward(req,res);
		  }//try
		  catch(Exception e) {
			  rd=req.getRequestDispatcher("/error.html");
			  rd.forward(req, res);
		  }
	}
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doGet(req,res);
	}
	

}
