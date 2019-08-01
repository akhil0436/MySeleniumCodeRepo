package com.Adactin.qa.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.Adactin.qa.util.TestUtil;

public class TestBase {

	
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase()
	{
		
		try {
			prop=new Properties();
			FileInputStream fis=new FileInputStream("C:\\Users\\Welcome\\eclipse-workspace\\SeleniumPractice\\AdactinProject\\src\\main\\java\\com\\Adactin\\qa\\config\\config.properties");
			
			prop.load(fis);
		} 
		catch (FileNotFoundException e) 
		{
		   
			
			System.out.println(e.getMessage());
			
		}
       catch (IOException e) 
		{
		   
			 
			System.out.println(e.getMessage());
			
		}
		
	}

	
	public static void initialization()

	{
		
		String browserName=prop.getProperty("browser");
		
		if(browserName.equals("chrome"))
		{
			System.setProperty("WebDriver.chrome.driver", "C:\\Users\\Welcome\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			driver=new ChromeDriver();
			
		}
		else if(browserName.equals("firefox"))
		{
			
			driver=new FirefoxDriver();
			
		}
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(TestUtil.Page_laod_Timeout, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Wait, TimeUnit.SECONDS);
		
		
		
		driver.get(prop.getProperty("url"));
		
	}
	
}
	
	
	
	

