package Grouping_TestNG.Grp_TestNG;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Method_dependency 
{
	public static String trackingNumber=null;
	
	@Test(enabled=false)
	public void createShipment()
	{
		System.out.println(10/0);
		System.out.println("Create Shipment");
		trackingNumber="1245Ad8T";
	}
	
	@Test(dependsOnMethods= {"createShipment"},ignoreMissingDependencies= true)// Give either priority or dependency
	public void trackShipment() throws Exception
	{
		if(trackingNumber!=null)
			System.out.println("track Shipment");
		else
			throw new Exception("Invalid tracking number");
	}
	
	
}

/*
 * If we dependent test fails then original will skipped and still we want to run original then set 
 * alwaysRun=true then even dependent fails still original will run.
 * 
 * If dependent test have @ignore annotation or not present in current program then no any test will 
 * run/skip/fail/pass just it will return 0 test only.Still you want to run then add parameter as
 * ignoreMissingDependencies=true in @Test parameter.
*/