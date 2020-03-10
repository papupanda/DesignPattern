package com.nt.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.nt.commons.Log4jConfigurations;
import com.nt.delegate.EmployeeMgmtDelegate;
import com.nt.errors.EmployeeAlreadyRegisteredException;
import com.nt.errors.InternalProblemException;
import com.nt.errors.TooLargeValueException;
import com.nt.vo.EmployeeVO;

@WebServlet("/controller")
public class MainControllerServlet extends HttpServlet {
	private static Logger logger;
	public MainControllerServlet() {
		logger=Logger.getLogger(MainControllerServlet.class);
		Log4jConfigurations.enableLog4j();
		
	}
	
	
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		  EmployeeVO vo=null;
		  EmployeeMgmtDelegate delegate=null;
		  String resultMsg=null;
		  RequestDispatcher rd=null;
		  String targetPage=null;
		//read form data and store into VO class object
		  vo=new EmployeeVO();
		  vo.setDeptNo(req.getParameter("deptno"));
		  vo.setEmpName(req.getParameter("ename"));
		  vo.setEmpAddrs(req.getParameter("eaddrs"));
		  vo.setEmpSalary(req.getParameter("esalary"));
		  vo.setEmpDesg(req.getParameter("edesg"));
		  logger.debug("form data is read and stored in to VO class obj");
		  //create BusinessDelegate class object
		  delegate=new EmployeeMgmtDelegate();
		  logger.info("Business Delegate class obj is created");
		  try {
			  resultMsg=delegate.registerEmployee(vo);
			  logger.info("Business Delegate method is created");
			  req.setAttribute("result",resultMsg);
			  logger.info("result is kept in request scope to pass to result page");
			  targetPage="show_result.jsp";
			  logger.debug("show_result.jsp is taken as target page");
		  }
		  catch(EmployeeAlreadyRegisteredException eare) {
			  targetPage="error1.jsp";
			  logger.error("Employee Already registered"+eare.getMessage());
		  }
		  catch(TooLargeValueException tlve) {
			  logger.error("Too large value Exception"+tlve.getMessage());
			  targetPage="error2.jsp";
		  }
		  catch(InternalProblemException ipe) {
			  logger.error("Internal Problem Exception"+ipe.getMessage());
			  targetPage="error3.jsp";
		  }
		  
		  //froward to  taget page
		  rd=req.getRequestDispatcher(targetPage);
		  rd.forward(req,res);
		  logger.info("request is forwarded to Target page");
	}//doGet(-,-)
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	    doGet(req,res);
	}//doPost(-,-)
}//class
