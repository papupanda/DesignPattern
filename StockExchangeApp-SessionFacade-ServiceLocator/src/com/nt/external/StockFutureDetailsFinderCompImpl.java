package com.nt.external;

import com.nt.dto.StockFutureValueDTO;
import com.nt.dto.StockIdDetailsDTO;

public class StockFutureDetailsFinderCompImpl implements StockFutureValueFinderComp {

	@Override
	public StockFutureValueDTO getStockFutureValue(StockIdDetailsDTO idDTO) {
	    StockFutureValueDTO ftrDTO=null;
	    if(idDTO.getStockId()==1001) {
	    	ftrDTO=new StockFutureValueDTO();
	    	ftrDTO.setFutureValue(500);
	    	ftrDTO.setVariationRate(6);
	    }
	    else if(idDTO.getStockId()==1002) {
	    	ftrDTO=new StockFutureValueDTO();
	    	ftrDTO.setFutureValue(600);
	    	ftrDTO.setVariationRate(60);
	    }
	    else if(idDTO.getStockId()==1003) {
	    	ftrDTO=new StockFutureValueDTO();
	    	ftrDTO.setFutureValue(600);
	    	ftrDTO.setVariationRate(10);
	    }
	    else {
	    	throw new IllegalArgumentException("Invalid StockId");
	    }
	    return ftrDTO;
	}//method
}//class
