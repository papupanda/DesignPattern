package com.nt.facade;

import com.nt.dto.StockDetailsDTO;
import com.nt.dto.StockFutureValueDTO;
import com.nt.dto.StockIdDetailsDTO;
import com.nt.dto.StockInputsDTO;
import com.nt.dto.StockValueDTO;
import com.nt.external.StockCurrentValueFinderComp;
import com.nt.external.StockCurrentValueFinderCompImpl;
import com.nt.external.StockFutureDetailsFinderCompImpl;
import com.nt.external.StockFutureValueFinderComp;
import com.nt.external.StockIdDetailsFinderComp;
import com.nt.external.StockIdDetailsFinderCompImpl;

public class StockDetailsFinderCompSessionFacadeImpl implements StockDetailsFinderCompSessionFacade {

	@Override
	public StockDetailsDTO getStockFullDetails(StockInputsDTO ipDTO) {
		StockDetailsDTO fullDTO=null;
		StockIdDetailsFinderComp extComp1=null;
		StockCurrentValueFinderComp extComp2=null;
		StockFutureValueFinderComp extComp3=null;
		StockIdDetailsDTO idDTO=null;
		StockValueDTO valDTO=null;
		StockFutureValueDTO ftrDTO=null;
		
		//invoke multiple extenal comps
		//external comp1
		extComp1=new StockIdDetailsFinderCompImpl();
		idDTO=extComp1.getStockIdByNickName(ipDTO.getStockName());
		//external comp2
		extComp2=new StockCurrentValueFinderCompImpl();
		valDTO=extComp2.getCurrentStockValue(idDTO);
		//external comp2
		extComp3=new StockFutureDetailsFinderCompImpl();
		ftrDTO=extComp3.getStockFutureValue(idDTO);
		//prepare StockDetailsDTO having full stock Details
		fullDTO=new StockDetailsDTO();
		fullDTO.setBasePrice(valDTO.getBaseValue());
		fullDTO.setCompanyName(idDTO.getCompany());
		fullDTO.setExchangeName(ipDTO.getExchangeName());
		fullDTO.setFutureValue(ftrDTO.getFutureValue());
		fullDTO.setListedDate(valDTO.getListedDate());
		fullDTO.setStockCount(valDTO.getStockCount());
		fullDTO.setStockId(idDTO.getStockId());
		fullDTO.setStockName(ipDTO.getStockName());
		fullDTO.setStockValue(valDTO.getStockValue());
		fullDTO.setVariationRate(ftrDTO.getVariationRate());
		return fullDTO;
	}//method
}//calss
