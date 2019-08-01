package com.Adactin.qa.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Adactin.qa.Base.TestBase;

public class LoginPage extends TestBase{
	
	//Page Factory or Object Repossitory
	
	@FindBy(id="username")
	WebElement username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(id="login")
	WebElement loginBtn;
	
	@FindBy(xpath="//img[contains(@class, 'logo')]")
	WebElement adactinLogo;
	
	@FindBy(xpath="//a[contains(text(), 'New User Register Here')]")
	WebElement signupLink;
	
	@FindBy(xpath="/html/body/table[2]/tbody/tr/td[2]/table/tbody/tr[2]/td/ul/li[2]/a/strong")
	WebElement GotoBuild2Link;

	
	//intializing the page objects.
	public LoginPage()
	{
		
		PageFactory.initElements(driver, this);
		
	}	
	
	//for Perform Actions
	
	public String ValidateLoginPageTitle()
	{
		String pagetitle=driver.getTitle();
		return pagetitle;
	}
	
	public boolean ValidateAdactinLogo()
	{
		
		return adactinLogo.isDisplayed();
		
	}
	
	
	public SearchHotelPage Login(String un, String pwd)
	{
		
		username.sendKeys(un);
		
		password.sendKeys(pwd);
		
		loginBtn.click();
		
		return new SearchHotelPage();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
