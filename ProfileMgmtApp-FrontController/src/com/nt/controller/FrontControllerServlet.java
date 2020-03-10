package com.nt.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nt.command.Command;
import com.nt.command.CommandHelper;
import com.nt.command.ProfileMgmtCommand;
import com.nt.dispatcher.Dispatcher;

public class FrontControllerServlet extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String uri=null;
		Command cmd=null;
		String lvn=null;
		try {
	   //get Command class object based on incoming request uri
		uri=req.getServletPath();
		cmd=CommandHelper.getCommand(uri);
		//call execute(-,-) method 
		lvn=cmd.execute(req, res);
		//Dispatch request to Physical view comp
		Dispatcher.dispatch(req, res, lvn);
		}//try
		catch(Exception e) {
			e.printStackTrace();
			try {
			req.setAttribute("errMsg",e.getMessage());
			Dispatcher.dispatch(req, res, "error");
			}
			catch(Exception ex) {
				ex.printStackTrace();
			}
		}
	}//method
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
           doGet(req,res);
	}

}
