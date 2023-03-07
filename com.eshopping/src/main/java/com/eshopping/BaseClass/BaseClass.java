package com.eshopping.BaseClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BaseClass {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public BaseClass()	//filereading from config.properties
	{
		prop =new Properties();
		FileInputStream fis;
		
		try
		{
			fis=new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\com.eshopping\\src\\main\\java\\com\\eshopping\\config\\properties\\config.properties");
		prop.load(fis);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	
	public void initiation()
	{
		String browsername="chrome";
		if(browsername.equals(prop.getProperty("browser")))
		{
			driver=new ChromeDriver();
		}
		else
		{
			driver=new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get(prop.getProperty("testurl"));
		
	}
	
	
	
	
}
