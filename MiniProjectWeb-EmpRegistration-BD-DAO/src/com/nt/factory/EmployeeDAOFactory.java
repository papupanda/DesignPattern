package com.nt.factory;

import org.apache.log4j.Logger;

import com.nt.commons.Log4jConfigurations;
import com.nt.dao.EmployeeDAO;
import com.nt.dao.FinanceEmployeeDAOImpl;
import com.nt.dao.HREmployeeDAOImpl;

public class EmployeeDAOFactory {
	private static Logger logger;
	static {
		logger=Logger.getLogger(EmployeeDAOFactory.class);
		Log4jConfigurations.enableLog4j();
	}

	  public static  EmployeeDAO   getDAO(String type) {
		  EmployeeDAO dao=null;
		  logger.debug("getDAO()");
		  if(type.equalsIgnoreCase("HR"))
			  dao=new HREmployeeDAOImpl();
		  else if(type.equalsIgnoreCase("FINANCE"))
			  dao=new FinanceEmployeeDAOImpl();
		  else
			  throw new IllegalArgumentException("Invalid DAO type");
		  logger.info("DAO class obj is created and returned");
		  return dao;
	  }
}
