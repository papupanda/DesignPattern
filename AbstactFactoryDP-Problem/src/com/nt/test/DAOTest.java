package com.nt.test;

import com.nt.dao.DAO;
import com.nt.factory.DBDAOFactory;
import com.nt.factory.ExcelDAOFactory;

public class DAOTest {

	public static void main(String[] args) {
		 DAO dao=null;
		 dao=DBDAOFactory.getInstance("student");
		 dao.insert();
		 System.out.println("..................................");
		 dao=ExcelDAOFactory.getInstance("course");
		 dao.insert();

	}

}
