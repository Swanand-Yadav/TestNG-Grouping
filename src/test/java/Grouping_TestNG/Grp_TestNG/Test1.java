package Grouping_TestNG.Grp_TestNG;

import org.testng.annotations.Test;

@Test(groups= {"All"})
public class Test1 
{
	@Test(groups= {"smoke"})// Those names are user defined not predefined (smoke,functional,...etc) 
	public void test1()
	{
		System.out.println("test1");
	}
	
	@Test(groups= {"smoke","functional","sanity"}) // This test case is a part of smoke as well as functional
	public void test2()
	{
		System.out.println("test2");
	}
	
	@Test(groups= {"functional","regression"})// We can take any no. of parameters as having array
	public void test3()
	{
		System.out.println("test3");
	}
	
	@Test(groups= {"Windows.smoke"})
	public void test4()
	{
		System.out.println("test4");
	}
	
	@Test
	public void test5()
	{
		System.out.println("test5");
	}
}
