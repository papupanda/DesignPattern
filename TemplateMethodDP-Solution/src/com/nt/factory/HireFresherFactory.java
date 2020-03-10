package com.nt.factory;

import com.nt.hiring.HireDotNetFresher;
import com.nt.hiring.HireFresher;
import com.nt.hiring.HireJavaFresher;

public class HireFresherFactory {
	public  static HireFresher getInstance(String domain) {
		  HireFresher fresher=null;
		  if(domain.equalsIgnoreCase("java"))
			  fresher=new HireJavaFresher();
		  else if(domain.equalsIgnoreCase("dotnet"))
			  fresher=new HireDotNetFresher();
		  else
			  throw  new IllegalArgumentException("Invalid Domain");
		  return fresher;
		
	}

}
