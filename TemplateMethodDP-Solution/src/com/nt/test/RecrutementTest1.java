package com.nt.test;

import com.nt.factory.HireFresherFactory;
import com.nt.hiring.HireFresher;
import com.nt.hiring.HireJavaFresher;

public class RecrutementTest1 {

	public static void main(String[] args) {
		HireFresher fresher=null;
		boolean result=false;
		fresher=HireFresherFactory.getInstance("java");
		result=fresher.recruitmentProcess();
		if(result)
			System.out.println("U Selected for Java Job");
		else
			System.out.println("U r  not Selected for Java Job");
	}
}
