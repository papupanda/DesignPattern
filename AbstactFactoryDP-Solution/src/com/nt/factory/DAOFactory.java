package com.nt.factory;

import com.nt.dao.DAO;

public interface DAOFactory {
	public     DAO   getInstance(String type);

}
