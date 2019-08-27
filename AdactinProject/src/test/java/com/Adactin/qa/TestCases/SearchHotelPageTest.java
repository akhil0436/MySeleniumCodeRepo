package com.Adactin.qa.TestCases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Adactin.qa.Base.TestBase;
import com.Adactin.qa.Pages.LoginPage;
import com.Adactin.qa.Pages.SearchHotelPage;

public class SearchHotelPageTest extends TestBase {
	
	
	LoginPage loginpage;
	SearchHotelPage sehpage;
	
	
	public SearchHotelPageTest(){
		super();
	}
	
	@BeforeMethod
	public void openBrowser1()
	{
		openBrowser();
		sehpage=loginpage.Login(prop.getProperty("username"), prop.getProperty("password"));
		
		
		
	}
	
	@Test
	public void verifyusernametest()
	{
		
		String verifytitle=sehpage.ValidateUsernameVerify();
	
		
		Assert.assertEquals(verifytitle, "akhil09866", "Username login with another credientials");
		
	}
	
	
	

}
