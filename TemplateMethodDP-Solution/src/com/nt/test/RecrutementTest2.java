package com.nt.test;

import com.nt.factory.HireFresherFactory;
import com.nt.hiring.HireDotNetFresher;
import com.nt.hiring.HireFresher;

public class RecrutementTest2 {

	public static void main(String[] args) {
		HireFresher fresher=null;
		boolean result=false;
		fresher=HireFresherFactory.getInstance("dotnet");
		result=fresher.recruitmentProcess();
		if(result)
			System.out.println("U Selected for DotNet Job");
		else
			System.out.println("U r  not Selected for DotNet Job");
	}
}
