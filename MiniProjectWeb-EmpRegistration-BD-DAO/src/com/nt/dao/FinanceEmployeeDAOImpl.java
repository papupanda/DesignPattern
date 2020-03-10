package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import com.nt.bo.BaseBO;
import com.nt.bo.FinanceEmployeeBO;
import com.nt.commons.Log4jConfigurations;

public class FinanceEmployeeDAOImpl implements EmployeeDAO {
	private static Logger logger;
	private static final String  INSERT_FINANCE_EMP="INSERT INTO FINANCEEMP VALUES(EMPNO_SEQ1.NEXTVAL,?,?,?,?)";
    static {
    	logger=Logger.getLogger(FinanceEmployeeDAOImpl.class);
    	Log4jConfigurations.enableLog4j();
    }
	@Override
	public void insert(Connection con, BaseBO bo) throws SQLException {
		PreparedStatement ps=null;
		logger.debug("insert(con,bo) method");
		try {
			//create PreparedStatement object
			ps=con.prepareStatement(INSERT_FINANCE_EMP);
			logger.info("preparedStaement obj created");
			//set values to Query params
			ps.setString(1,bo.getEmpName());
			ps.setString(2,bo.getEmpAddrs());
			ps.setFloat(3,((FinanceEmployeeBO)bo).getEmpSalary());
			ps.setInt(4,bo.getDeptNo());
			logger.info("values are set to query params");
			//execute the Query
			ps.executeUpdate();
			logger.info("query executed");
		}
		catch(SQLException se) {
			logger.error("DB Problem ::"+se.getMessage());
			throw  se;
		}
		finally {
			try {
				if(ps!=null) {
					ps.close();
					logger.info("PrepredStatement obj is closed");
				}
			}
			catch(SQLException se) {
				se.printStackTrace();
				logger.error("Problem in closing PreparedStatement obj"+se.getMessage());
				throw se;
			}
		}//finally
	}//method
}//class
