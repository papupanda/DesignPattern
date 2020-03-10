package com.nt.external;

import com.nt.dto.StockIdDetailsDTO;

public class StockIdDetailsFinderCompImpl implements StockIdDetailsFinderComp {

	@Override
	public StockIdDetailsDTO getStockIdByNickName(String nickname) {
		StockIdDetailsDTO dto=null;
		if(nickname.equalsIgnoreCase("icici")) {
			   dto=new StockIdDetailsDTO();
			   dto.setStockId(1001);
			   dto.setCompany("ICICI Bank");
		}
		else if(nickname.equalsIgnoreCase("jio")) {
			   dto=new StockIdDetailsDTO();
			   dto.setStockId(1002);
			   dto.setCompany("Reliance");
		}
		else if(nickname.equalsIgnoreCase("TCS")) {
			dto=new StockIdDetailsDTO();
			dto.setStockId(1003);
			dto.setCompany("TATA");
		}
		else {
		  throw  new IllegalArgumentException("Invalid Inputs");	
		}
			
		return dto;
		
	}//method
}//class
