package com.nt.hiring;

public class HireDotNetFresher extends HireFresher {

	@Override
	public boolean conductTechnicalTest() {
		System.out.println("Conducting DotNet Technical Interview");
		return true;
	}

	@Override
	public boolean conductSystemTest() {
		System.out.println("Conducting DotNet System Test");
		return true;
	}

}
