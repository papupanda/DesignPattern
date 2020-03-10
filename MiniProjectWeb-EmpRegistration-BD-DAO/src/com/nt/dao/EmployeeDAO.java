package com.nt.dao;

import java.sql.Connection;
import java.sql.SQLException;

import com.nt.bo.BaseBO;

public interface EmployeeDAO {
	public  void  insert(Connection con,BaseBO bo)throws SQLException;

}
