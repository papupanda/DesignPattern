package com.nt.delegate;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.NamingException;

import org.apache.log4j.Logger;

import com.nt.bo.FinanceEmployeeBO;
import com.nt.bo.HREmployeeBO;
import com.nt.commons.Log4jConfigurations;
import com.nt.dao.EmployeeDAO;
import com.nt.errors.EmployeeAlreadyRegisteredException;
import com.nt.errors.InternalProblemException;
import com.nt.errors.TooLargeValueException;
import com.nt.factory.DBConnectionFactory;
import com.nt.factory.EmployeeDAOFactory;
import com.nt.vo.EmployeeVO;

public class EmployeeMgmtDelegate {
	private static Logger logger;
	static {
		logger=Logger.getLogger(EmployeeMgmtDelegate.class);
		Log4jConfigurations.enableLog4j();
	}
	
	public  String   registerEmployee(EmployeeVO vo)throws InternalProblemException,EmployeeAlreadyRegisteredException,TooLargeValueException {
		HREmployeeBO hbo=null;
		FinanceEmployeeBO fbo=null;
		Connection con=null;
		EmployeeDAO  hrDAO=null, financeDAO=null;
		boolean isExceptionRaised=false;
		String statusMsg=null;
		logger.debug("registerEmployee(vo)");
		try {
			//get Pooled JDBC connection object
			con=DBConnectionFactory.getPooledConnection();
			logger.info("Pooled connection is gathered");
			//Begin Tx
			con.setAutoCommit(false);  //case3
			logger.info("Transaction begun");
		 //convert VO class object to BO classes  objects  (case1)
		hbo=new HREmployeeBO();
		fbo=new FinanceEmployeeBO();
		hbo.setEmpName(vo.getEmpName());
		hbo.setEmpAddrs(vo.getEmpAddrs());
		hbo.setEmpDesg(vo.getEmpDesg());
		hbo.setDeptNo(Integer.parseInt(vo.getDeptNo()));
		
		fbo.setEmpName(vo.getEmpName());
		fbo.setEmpAddrs(vo.getEmpAddrs());
		fbo.setEmpSalary(Float.parseFloat(vo.getEmpSalary()));
		fbo.setDeptNo(Integer.parseInt(vo.getDeptNo()));
		 logger.info("VO class objects data is converted BO class objects");
		
		//get DAOs
		hrDAO=EmployeeDAOFactory.getDAO("HR");
		financeDAO=EmployeeDAOFactory.getDAO("Finance");
		logger.info("Both DAO class object gathered from Factory");
		//use DAO  for Employee registration
		financeDAO.insert(con, fbo);
		hrDAO.insert(con, hbo);
		 isExceptionRaised=false; //case3
		 logger.info("Persistence loigc executed sucessfully using dAOs");
		}
		catch(NamingException ne) {
			logger.error("Problem in gathering DataSource obj"+ne.getMessage());
			isExceptionRaised=true; //case3
			throw new InternalProblemException(ne.getMessage()); //case2
		}
		catch(SQLException se) {
			logger.error("Problem in gathering con obj"+se.getMessage());
			isExceptionRaised=true;//case3
			//case2 implementations...
			if(se.getErrorCode()==1) {
				logger.error("Employee already registred having this emp number"+se.getMessage());
				 throw new EmployeeAlreadyRegisteredException(se.getMessage());
			}
			else if(se.getErrorCode()==12899) {
				logger.error("Certain value is more than column size"+se.getMessage());
				throw new  TooLargeValueException(se.getMessage());
			}
			else {
				logger.error("Unknown DB Problem"+se.getMessage());
				throw  new InternalProblemException(se.getMessage());
			}
		}
		catch(Exception e) {
			isExceptionRaised=true;  //case3
			logger.fatal("Unknown Internal Problem"+e.getMessage());
			throw new InternalProblemException(e.getMessage());
		}
		finally {
			  //perform Transaction mgmt (case3)
			try {
				if(isExceptionRaised) {
					con.rollback();  
					logger.info("Transaction is rollback->registration failed");
					statusMsg="Registration Failed";
				}
				else {
					con.commit();
					logger.info("Transaction is Committed->registration Succeded");
					statusMsg="Registration succeded";
				}
			}//try
			catch(SQLException se) {
				logger.error("Problem in Trasaction management"+se.getMessage());
				se.printStackTrace();
			}
		}//finally
		return statusMsg;
	}//method
}//class
