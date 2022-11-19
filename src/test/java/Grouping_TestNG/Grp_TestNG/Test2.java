package Grouping_TestNG.Grp_TestNG;

import org.testng.annotations.Test;

public class Test2 
{
	@Test(groups= {"smoke","sanity"})
	public void test6()
	{
		System.out.println("test6");
	}
	
	@Test(groups= {"regression","sanity"}) 
	public void test7()
	{
		System.out.println("test7");
	}
	
	@Test(groups= {"functional"})
	public void test8()
	{
		System.out.println("test8");
	}
	
	@Test(groups= {"Windows.sanity"})
	public void test9()
	{
		System.out.println("test9");
	}
}
