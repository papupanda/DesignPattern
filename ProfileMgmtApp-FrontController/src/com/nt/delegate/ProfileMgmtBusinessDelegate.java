package com.nt.delegate;

import java.sql.SQLException;

import javax.naming.NamingException;

import com.nt.bo.ProfileBO;
import com.nt.dao.ProfileDAO;
import com.nt.dao.ProfileDAOImpl;
import com.nt.errors.InternalDBProblem;
import com.nt.errors.InternalRegistryProblem;
import com.nt.vo.ProfileVO;

public class ProfileMgmtBusinessDelegate {
	private ProfileDAO  dao=new ProfileDAOImpl();
	
	public  ProfileVO   searchProfileById(int id)throws InternalDBProblem,InternalRegistryProblem{
		ProfileBO bo=null;
		ProfileVO vo=null;
		try {
		//use DAO
		bo=dao.getProfileId(id);
		//convert bo to vo
		vo=new ProfileVO();
		vo.setPid(String.valueOf(bo.getPid()));
		vo.setPname(bo.getPname());
		vo.setAddrs(bo.getAddrs());
		vo.setQlfy(bo.getQlfy());
		vo.setMobileNo(String.valueOf(bo.getMobileNo()));
		}
		catch(SQLException se) {
			throw new InternalDBProblem(se.getMessage());
		}
		catch(NamingException ne) {
			throw new InternalRegistryProblem(ne.getMessage());
		}
		return vo;
	}//method
}//class
