
package com.eshopping.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.eshopping.BaseClass.BaseClass;

public class HomePage extends BaseClass{
	
	@FindBy(xpath="//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/a[1]")
	WebElement home;
	
	@FindBy(xpath="//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[2]/a[1]")
	WebElement product;
	
	
	@FindBy(xpath="//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[3]/a[1]")
	WebElement cart;
	
	@FindBy(xpath="//body[1]/header[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[4]/a[1]")
	WebElement signin;
	
	@FindBy(xpath="//body[1]/header[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[8]/a[1]")
	WebElement contactus;
	
	@FindBy(xpath="//body[1]/section[2]/div[1]/div[1]/div[1]/div[1]/h2[1]")
	WebElement category;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public void homepageclick() {
		home.click();
	}
	
	
	public String titleverify()
	{
		String title=driver.getTitle();
		return title;
	}
	
	public String verifyhomepage()// verification whether we gone correctly or not
	{
		String currenturl=driver.getCurrentUrl();
		return currenturl;
	}
	
	public boolean verifyhomepage2()
	{
		boolean categry=category.isDisplayed();
		return categry;
	}

	
	public void productclick() {
		product.click();
	}

	public void signinclick() {
		signin.click();
	}

 }
