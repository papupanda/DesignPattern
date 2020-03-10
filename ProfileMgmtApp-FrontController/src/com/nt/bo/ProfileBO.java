package com.nt.bo;

import java.io.Serializable;

public class ProfileBO  {
	private int pid;
	private String pname;
	private String addrs;
	private String qlfy;
	private long mobileNo;
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getAddrs() {
		return addrs;
	}
	public void setAddrs(String addrs) {
		this.addrs = addrs;
	}
	public String getQlfy() {
		return qlfy;
	}
	public void setQlfy(String qlfy) {
		this.qlfy = qlfy;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

}
