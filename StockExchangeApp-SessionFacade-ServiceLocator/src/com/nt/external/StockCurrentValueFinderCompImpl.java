package com.nt.external;

import java.util.Date;

import com.nt.dto.StockIdDetailsDTO;
import com.nt.dto.StockValueDTO;

public class StockCurrentValueFinderCompImpl implements StockCurrentValueFinderComp {

	@Override
	public StockValueDTO getCurrentStockValue(StockIdDetailsDTO idDTO) {
		StockValueDTO valDTO=null;
		if(idDTO.getStockId()==1001) {
			valDTO=new StockValueDTO();
			valDTO.setBaseValue(200);
			valDTO.setStockCount(10000);
			valDTO.setStockValue(300);
			valDTO.setListedDate(new Date(2010,10,20));
		}
		else if(idDTO.getStockId()==1002) {
			valDTO=new StockValueDTO();
			valDTO.setBaseValue(100);
			valDTO.setStockCount(1000);
			valDTO.setStockValue(200);
			valDTO.setListedDate(new Date(2016,10,20));
		}
		else if(idDTO.getStockId()==1003) {
			valDTO=new StockValueDTO();
			valDTO.setBaseValue(500);
			valDTO.setStockCount(200);
			valDTO.setStockValue(700);
			valDTO.setListedDate(new Date(2013,10,20));
		}
		else {
		   throw new IllegalArgumentException("Invalid StockId");	
		}
		return valDTO;
	}//method
}//class
