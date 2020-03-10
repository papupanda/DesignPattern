package com.nt.dao;

import java.sql.SQLException;

import javax.naming.NamingException;

import com.nt.bo.ProfileBO;

public interface ProfileDAO {
	public  ProfileBO  getProfileId(int id)throws SQLException,NamingException;

}
