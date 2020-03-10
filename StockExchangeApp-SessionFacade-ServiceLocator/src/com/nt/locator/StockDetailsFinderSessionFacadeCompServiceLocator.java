package com.nt.locator;

import java.util.HashMap;
import java.util.Map;

import com.nt.facade.StockDetailsFinderCompSessionFacade;
import com.nt.facade.StockDetailsFinderCompSessionFacadeImpl;

public class StockDetailsFinderSessionFacadeCompServiceLocator {
	private  static  StockDetailsFinderSessionFacadeCompServiceLocator instance;
	private Map<String,Object>  cache;
	
	private  StockDetailsFinderSessionFacadeCompServiceLocator() {
		cache=new HashMap();
	}
	
	public  static  StockDetailsFinderSessionFacadeCompServiceLocator  getInstance() {
		if(instance==null)
			instance=new StockDetailsFinderSessionFacadeCompServiceLocator();
		return instance;
	}
	
	public   StockDetailsFinderCompSessionFacade   getExternalComp(String jndi) {
		StockDetailsFinderCompSessionFacade facade=null;
		if(!cache.containsKey(jndi)) {
			//jndi lookup code for getting SessionFacade object creation
			facade=new StockDetailsFinderCompSessionFacadeImpl();
		    cache.put(jndi,facade);
		}
		return (StockDetailsFinderCompSessionFacade) cache.get(jndi);
	}//method
}//class
