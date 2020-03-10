package com.nt.delegate;

import com.nt.dto.StockDetailsDTO;
import com.nt.dto.StockInputsDTO;
import com.nt.facade.StockDetailsFinderCompSessionFacade;
import com.nt.locator.StockDetailsFinderSessionFacadeCompServiceLocator;

import com.nt.vo.StockDetailsVO;
import com.nt.vo.StockInputsVO;


public class StockDetailsFinderBusinessDelegate {
	
	public  StockDetailsVO fetchStockDetailsByNickName(StockInputsVO ipVO) {
		StockInputsDTO ipDTO=null;
		StockDetailsFinderSessionFacadeCompServiceLocator locator=null;
		StockDetailsDTO fullDTO=null;
		StockDetailsFinderCompSessionFacade  facade=null;
		StockDetailsVO fullVO=null;
		//convert InputVO to InpuDTO
		ipDTO=new StockInputsDTO();
		ipDTO.setStockName(ipVO.getStockName());
		ipDTO.setExchangeName(ipVO.getExchangeName());
		//get ServiceLocator object
		locator=StockDetailsFinderSessionFacadeCompServiceLocator.getInstance();
		//get External comp ref
		facade=locator.getExternalComp("bseJndi");
		fullDTO=facade.getStockFullDetails(ipDTO);
		//convert fullDTO to fullVO class object
		fullVO=new StockDetailsVO();
		fullVO.setBasePrice(String.valueOf(fullDTO.getBasePrice()));
		fullVO.setCompanyName(fullDTO.getCompanyName());
		fullVO.setExchangeName(fullDTO.getExchangeName());
		fullVO.setFutureValue(String.valueOf(fullDTO.getFutureValue()));
		fullVO.setListedDate(fullDTO.getListedDate().toString());
		fullVO.setStockCount(String.valueOf(fullDTO.getStockCount()));
		fullVO.setStockId(String.valueOf(fullDTO.getStockId()));
		fullVO.setStockName(fullDTO.getStockName());
		fullVO.setStockValue(String.valueOf(fullDTO.getStockValue()));
		fullVO.setVariationRate(String.valueOf(fullDTO.getVariationRate()));
		return fullVO;
	}

}
