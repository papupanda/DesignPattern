package com.nt.factory;

public class BuildDAOFactory {
	
	public  static  DAOFactory  getDAOFactory(String store) {
		DAOFactory factory=null;
		if(store.equalsIgnoreCase("excel"))
			factory=new ExcelDAOFactory();
		else if(store.equalsIgnoreCase("DB"))
			factory=new DBDAOFactory();
		
		return factory;
			
	}

}
