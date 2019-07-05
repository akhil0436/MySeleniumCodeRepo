package KatalonPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class freeCrmVerifyCalender {

	WebDriver driver;
	
	@BeforeClass(alwaysRun = true)
	  public void setUp() throws Exception {
	    driver = new ChromeDriver();
	    driver.get("https://freecrm.com/");
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Pricing'])[1]/following::span[2]")).click();
	    driver.findElement(By.name("email")).clear();
	    driver.findElement(By.name("email")).sendKeys("imakhil6@gmail.com");
	    driver.findElement(By.name("password")).clear();
	    driver.findElement(By.name("password")).sendKeys("Ak@123456");
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Forgot your password?'])[1]/preceding::div[1]")).click();
	}

	  @Test
	  public void testVerifyCalender() throws Exception {
	    
		  
		Thread.sleep(5000);  
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Home'])[1]/following::span[1]")).click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Sync now'])[1]/following::button[1]")).click();
	    driver.findElement(By.name("title")).click();
	    
	    Thread.sleep(5000);
	    
	    driver.findElement(By.name("title")).clear();
	    driver.findElement(By.name("title")).sendKeys("newcalender");
	    
	    Thread.sleep(5000);
	    
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Category'])[1]/following::div[1]")).click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Opportunity'])[1]/following::div[1]")).click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='End Date'])[1]/following::button[1]")).click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Tags'])[1]/following::div[1]")).click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Tags'])[1]/following::input[1]")).clear();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Tags'])[1]/following::input[1]")).sendKeys("akhil");
	    
	    Thread.sleep(5000);
	    
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='akhil'])[1]/following::div[3]")).click();
	    driver.findElement(By.name("location")).click();
	    
	    Thread.sleep(5000);
	    
	    driver.findElement(By.name("location")).clear();
	    driver.findElement(By.name("location")).sendKeys("california");
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Alert Before'])[1]/following::i[1]")).click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Alert Before'])[1]/following::div[8]")).click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Save'])[1]/i[1]")).click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Subscribe to notifications'])[1]/following::i[1]")).click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='End Date'])[1]/following::input[1]")).click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Su'])[1]/following::div[16]")).click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Time'])[1]/following::li[68]")).click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Cancel'])[1]/following::button[1]")).click();
	  }
	
	
}
