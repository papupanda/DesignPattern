package com.nt.hiring;

public class HireJavaFresher  extends HireFresher{
	
	@Override
	public boolean conductTechnicalTest() {
		System.out.println("Conducting Java Technical Interview");
		return false;
	}

	@Override
	public boolean conductSystemTest() {
		System.out.println("Conducting Java System Test");
		return true;
	}

}
