package com.nt.facade;

import com.nt.dto.StockDetailsDTO;
import com.nt.dto.StockInputsDTO;

public interface StockDetailsFinderCompSessionFacade {
	public   StockDetailsDTO  getStockFullDetails(StockInputsDTO ipDTO);

}
