package com.nt.test;

import com.nt.dao.DAO;
import com.nt.factory.BuildDAOFactory;
import com.nt.factory.DAOFactory;
import com.nt.factory.ExcelDAOFactory;

public class AbstractFactoryTest {

	public static void main(String[] args) {
		 DAO dao1=null,dao2=null;
		 DAOFactory factory=null;
		 factory=BuildDAOFactory.getDAOFactory("excel");
		 dao1=factory.getInstance("student");
		 System.out.println("..................................");
		 dao2=factory.getInstance("course");
		 dao1.insert();
		 dao2.insert();

	}

}
