package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import com.nt.bo.BaseBO;
import com.nt.bo.HREmployeeBO;
import com.nt.commons.Log4jConfigurations;

public class HREmployeeDAOImpl implements EmployeeDAO {
	private static Logger logger;
	private static final String  INSERT_HR_EMP="INSERT INTO HREMP VALUES(EMPNO_SEQ1.CURRVAL,?,?,?,?)";
	  static {
	    	logger=Logger.getLogger(HREmployeeDAOImpl.class);
	    	Log4jConfigurations.enableLog4j();
	    }
	@Override
	public void insert(Connection con, BaseBO bo) throws SQLException {
		PreparedStatement ps=null;
		logger.debug("insert(con,bo)");
		try {
			//create PreparedStatement object
			ps=con.prepareStatement(INSERT_HR_EMP);
			logger.info("PreparedSTatement obj is created");
			//set values to Query params
			ps.setString(1,bo.getEmpName());
			ps.setString(2,bo.getEmpAddrs());
			ps.setString(3,((HREmployeeBO)bo).getEmpDesg());
			ps.setInt(4,bo.getDeptNo());
			logger.info("Values are set to Query params");
			//execute the Query
			ps.executeUpdate();
			logger.info("Query executed");
		}
		catch(SQLException se) {
			logger.error("DB Problem::"+se.getMessage());
			throw  se;
		}
		finally {
			try {
				if(ps!=null) {
					logger.info("PreparedStatement obj is closed");
					ps.close();
				}
			}
			catch(SQLException se) {
				logger.error("problem in closing PreparedStatement obj"+se.getMessage());
				se.printStackTrace();
				throw se;
			}
		}//finally
	}//method
}//class
