package com.eshopping.Tests;



import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.eshopping.BaseClass.BaseClass;

public class HomePageTest extends BaseClass {
	
	 
	
	@BeforeMethod
	public void setup()
	{
		initiation();
	}
	
	public HomePageTest()
	{
		super();
	}
	
	
	@AfterMethod
	public void teardown()
	{
		driver.close();
	}
	
	
	
	
}
