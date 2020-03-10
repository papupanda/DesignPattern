package com.nt.test;

import com.nt.hiring.HireDotNetFresher;
import com.nt.hiring.HireFresher;

public class RecrutementTest2 {

	public static void main(String[] args) {
		HireFresher fresher=null;
		fresher =new HireDotNetFresher();
		boolean result=false;
		result=fresher.conductAptitudeTest();
		if(result)
			result=fresher.conductGDTest();
		 if(result)
			result=fresher.conductTechnicalTest();
		 if(result)
			result=fresher.conductSystemTest();
		 if(result)
			result=fresher.conductHRInterView();
		
		if(result)
			System.out.println("U Selected for DotNet Job");
		else
			System.out.println("U r  not Selected for DotNet Job");
	}
}
