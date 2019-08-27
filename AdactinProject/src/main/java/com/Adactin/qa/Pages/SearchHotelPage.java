package com.Adactin.qa.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Adactin.qa.Base.TestBase;


public class SearchHotelPage extends TestBase {
	
	//Page Factory or Object Repossitory
	
	@FindBy(id="username_show")
	WebElement UsernameVerify;
	
	@FindBy(xpath="/html/body/table[2]/tbody/tr[1]/td[2]/a[2]")
	WebElement BookedItineraryLink;
	
	@FindBy(xpath="/html/body/table[2]/tbody/tr[1]/td[2]/a[3]")
    WebElement  ChangePasswordLink ;
	
	@FindBy(xpath="/html/body/table[2]/tbody/tr[1]/td[2]/a[4]")
    WebElement LogoutLink;
	

	@FindBy(id="location") 
	WebElement LocationDropDownList;

	@FindBy(id="hotels")
	WebElement hotelsDropdown;
	
	@FindBy(id="room_type")
	WebElement room_typeDrpdwn;
	
	@FindBy(id="room_nos")
	WebElement room_nosDropdown;
	
	@FindBy(id="datepick_in")
	WebElement datepick_inDropdown;
	
	@FindBy(id="datepick_out")
	WebElement datepick_outDropdown;
	
	@FindBy(id="adult_room")
	WebElement adult_roomDropdown;
	
	@FindBy(id="child_room")
	WebElement child_roomDropdown;
	
	@FindBy(id="Submit")
	WebElement SubmitBtn;
	
	@FindBy(id="Reset")
	WebElement ResetBtn;
	
	
	
	//intializing the page objects.

	public SearchHotelPage()
	{
		
		
		PageFactory.initElements(driver, this);
	}
	
	
	//for Perform Actions

	public String ValidateUsernameVerify()
	{

		return UsernameVerify.getText();
	}
	
	
	public BookedItineraryPage VerifyBookedItineraryLink()
	{
		BookedItineraryLink.click();
		return new BookedItineraryPage();
	}
	
	


	public ChangePasswordpage VerifyChangePasswordLink()
	{
		ChangePasswordLink.click();
		return new ChangePasswordpage();
	}
	
	
	public LogoutPage VerifyLogoutLink()
	{
		
	    LogoutLink.click();
	    return new LogoutPage();
	
	}
	
	
	
	
	
	
	
	
	
	
	
}
