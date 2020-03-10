package com.nt.external;

import com.nt.dto.StockFutureValueDTO;
import com.nt.dto.StockIdDetailsDTO;

public interface StockFutureValueFinderComp {
	
	public  StockFutureValueDTO  getStockFutureValue(StockIdDetailsDTO dto);

}
