package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import com.nt.bo.ProfileBO;

public class ProfileDAOImpl implements ProfileDAO {
	private static final String GET_PROFILE_BY_ID="SELECT PID,PNAME,ADDRS,QLFY,MOBILENO FROM PROFILE_INFO WHERE PID=?"; 
	
	private Connection getPooledConnection()throws  NamingException,SQLException {
		InitialContext ic=null;
		DataSource ds=null;
		Connection con=null;
		//get DataSource obj
		ic=new InitialContext();
		ds=(DataSource) ic.lookup("java:/comp/env/DsJndi");
		//get Pooled Connection object
		con=ds.getConnection();
		return con;
	}

	@Override
	public ProfileBO getProfileId(int id) throws SQLException,NamingException{
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		ProfileBO bo=null;
		try {
			//get Pooled Connection object
			con=getPooledConnection();
			//create PreparedStatement object
			ps=con.prepareStatement(GET_PROFILE_BY_ID);
			//set values to Query params
			ps.setInt(1,id);
			//execute Query
			rs=ps.executeQuery();
			
			//process the ResultSet object
			bo=new ProfileBO();
			if(rs.next()) {
				bo.setPid(rs.getInt(1));
				bo.setPname(rs.getString(2));
				bo.setAddrs(rs.getString(3));
				bo.setQlfy(rs.getString(4));
				bo.setMobileNo(rs.getLong(5));
			}
			
		}//try
		catch(SQLException se) {
			se.printStackTrace();
			throw se;
		}
		catch(NamingException ne) {
			ne.printStackTrace();
			throw ne;
		}
		finally {
			//close jdbc objs
			try {
				if(rs!=null)
					rs.close();
			}
			catch(SQLException se) {
				se.printStackTrace();
			}
			try {
				if(ps!=null)
					ps.close();
			}
			catch(SQLException se) {
				se.printStackTrace();
			}
			try {
				if(con!=null)
					con.close();
			}
			catch(SQLException se) {
				se.printStackTrace();
			}
		}//finally
		return bo;
	}//method
}//class
