package com.Adactin.qa.TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Adactin.qa.Base.TestBase;
import com.Adactin.qa.Pages.LoginPage;

public class LoginPageTest extends TestBase  {
	
	
	LoginPage loginpage;
	
	public LoginPageTest(){
		super();
	}
	

	@BeforeMethod
	public void setUp()
	{
		openBrowser();
		loginpage=new LoginPage();
		
	}
	
	
	@Test(priority = 1)
	public void LoginPageTitleTest()
	{	
		
		
		String verifytitle=loginpage.ValidateLoginPageTitle();	
		
		Assert.assertEquals(verifytitle, "AdactIn.com - Hotel Reservation System");	
	}
	
	@Test(priority = 2)
	public void varifylogo()

	{
		
		Boolean logo=loginpage.ValidateAdactinLogo();
		
		Assert.assertTrue(logo);
		
	}
	
	
	@Test(priority = 3)
	public void LoginTest()

	{
		
		loginpage.Login(prop.getProperty("username"), prop.getProperty("password"));
		
		
		
		
	}
	
	
	
	
	
	@AfterMethod
	public void tearDown()
	{
		
		driver.quit();
		
	}

}
