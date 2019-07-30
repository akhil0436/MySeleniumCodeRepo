package workingwithModularDrivenFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class AddEmpOnOrangeHRM {

	WebDriver driver;
	ReusableMethodsForOrangeHRM obj;
	
	@Test
	public void OrangeHRMTc1() throws InterruptedException
	{
		
		obj=new ReusableMethodsForOrangeHRM();
		
		obj.BrowserLaunch();
		
		obj.Login("Admin", "admin123");
		
		obj.CheckLoginStatus();
		
		Thread.sleep(5000);
		
	}
	@Test
	public void myOwnCondition() throws InterruptedException
	{
		
		try {
			driver.findElement(By.xpath("//*[@id=\"menu_pim_viewPimModule\"]/b")).click();
			
			Thread.sleep(5000);
			
			driver.findElement(By.id("menu_pim_addEmployee")).click();
		} 
		catch (Exception e) {

			System.out.println(e.getMessage());
			//e.printStackTrace();
		}
		   
		obj.Logout();
		
		obj.Close();
		
	}
	
	
	
}
