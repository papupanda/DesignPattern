package com.nt.external;

import com.nt.dto.StockIdDetailsDTO;
import com.nt.dto.StockValueDTO;

public interface StockCurrentValueFinderComp {
    public  StockValueDTO   getCurrentStockValue(StockIdDetailsDTO idDTO);
}
