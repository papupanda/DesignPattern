package com.nt.test;

import com.nt.hiring.HireFresher;
import com.nt.hiring.HireJavaFresher;

public class RecrutementTest1 {

	public static void main(String[] args) {
		HireFresher fresher=null;
		fresher =new HireJavaFresher();
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
			System.out.println("U Selected for Java Job");
		else
			System.out.println("U r  not Selected for Java Job");
	}
}
