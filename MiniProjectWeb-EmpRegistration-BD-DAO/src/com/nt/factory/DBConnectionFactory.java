package com.nt.factory;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ResourceBundle;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import org.apache.log4j.Logger;

import com.nt.commons.Log4jConfigurations;

public class DBConnectionFactory {
	private static Logger logger;
	private static String jndiName;
	static {
		ResourceBundle bundle=null;
		logger=Logger.getLogger(DBConnectionFactory.class);
		Log4jConfigurations.enableLog4j();
		try {
		bundle=ResourceBundle.getBundle("com/nt/commons/jdbc");
		jndiName=bundle.getString("ds.jndi");
		logger.info("DataSource Jndi is gathered from Properties file");
		}
		catch(Exception e) {
			logger.fatal("Unknown problem is gathering jndi name from properties file"+e.getMessage());
			e.printStackTrace();
		}
		
	}//static
	
	public static Connection  getPooledConnection()throws SQLException,NamingException{
		logger.debug("getPooledConnection()");
		 InitialContext ic=null;
		 DataSource ds=null;
		 Connection con=null;
		try {
			//perform jndi lookup operation to get JDBC DataSource object
			ic=new InitialContext();
			ds=(DataSource) ic.lookup(jndiName);
			logger.info("DataSource obj is gathered from Jndi Registry");
			// get Pooled jdbc connection
			con=ds.getConnection();
			logger.info("Connection obj is gathered from Jdbc con pool");
			
		}
		catch(NamingException ne) {
			logger.error("Problem in getting DataSource obj"+ne.getMessage());
			ne.printStackTrace();
			throw ne;
		}
		catch(SQLException se) {
			logger.error("Problem in getting pooled con object"+se.getMessage());
			se.printStackTrace();
			throw se;
		}
		return con;
	}//method
}//class
