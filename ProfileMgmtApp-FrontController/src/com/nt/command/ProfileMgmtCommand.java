package com.nt.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nt.delegate.ProfileMgmtBusinessDelegate;
import com.nt.vo.ProfileVO;

public class ProfileMgmtCommand implements Command {
	 private ProfileMgmtBusinessDelegate delegate=null;
	public    ProfileMgmtCommand() {
	   delegate=new ProfileMgmtBusinessDelegate();	
	}

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse res) throws Exception {
		ProfileVO  vo=null;
		//use BusinesDelegate
		vo=delegate.searchProfileById(Integer.parseInt(req.getParameter("id")));
		//keep result in request scoe
		req.setAttribute("profileInfo",vo);
		//return logical View name
		return "display";
	}

}
