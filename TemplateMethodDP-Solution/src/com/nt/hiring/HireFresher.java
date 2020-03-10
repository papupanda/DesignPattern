package com.nt.hiring;

public abstract class HireFresher {
	public boolean  conductAptitudeTest() {
		System.out.println("Conducting  AptitudeTest..");
		return true;
	}
	public boolean  conductGDTest() {
		System.out.println("Conducting  GroupDiscussionTest..");
		return true;
	}
	public boolean  conductHRInterView() {
		System.out.println("Conducting  HR Interview..");
		return true;
	}
	public abstract boolean conductTechnicalTest();
	public abstract boolean conductSystemTest();
	
	public boolean recruitmentProcess() {  //Template method DP
		boolean result=false;
		result=conductAptitudeTest();
		if(result)
			result=conductGDTest();
		 if(result)
			 result=conductTechnicalTest();
		 if(result)
			 result=conductSystemTest();
		 if(result)
			 result=conductHRInterView();
		return result;
	}
	
	

}
