package workingwithlinks;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class links {

	public static void main(String[] args) throws InterruptedException {
   
		/*ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/?gws_rd=ssl");
		
		Thread.sleep(5000);
		
		driver.findElement(By.linkText("Gmail")).click();
		
		String title=driver.getTitle();
		System.out.println(title);
		
		String expected="Gmail";
		String actual=driver.getTitle();
		
		if(actual.contains(expected)) {
			
			System.out.println("Pass");
		}
		else
		{
			
			System.out.println("Failed");
		}*/
		
		//Count no.of links in ICICI Bank home page
		
		ChromeDriver driver1=new ChromeDriver();
		driver1.get("https://templeinfo.co.in/");
		
		Thread.sleep(5000);
		List<WebElement> links=driver1.findElements(By.tagName("a"));
		System.out.println("no of links="+links.size());
		 for(int i=0; i<links.size(); i++) {
			 
			 String text=links.get(i).getText();
			 
			 System.out.println(text);
			 
		 }
		 
		 
		 //Navigate to walmart.com, search with "menshoes" select sneakers,under the category select canvas sneakers, cart "VANS" shoes.
		 
		 
		/*ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.walmart.com/");
		
		driver.manage().window().maximize();
		
		
	driver.findElement(By.id("global-search-input")).sendKeys("menshoes");
	driver.findElement(By.xpath("//*[@id=\'global-search-submit\']/span/span")).click();
	
	Thread.sleep(5000);
	driver.findElement(By.id("povActive")).click();
	
	driver.findElement(By.xpath("//*[@id=\'SearchContainer\']/div/div[5]/div[1]/div[1]/div[3]/div/div/button/span/span[2]")).click();

	driver.findElement(By.linkText("Mens Casual Shoes")).click();
	
	Thread.sleep(5000);

	
	driver.findElement(By.xpath("//*[@id=\'searchProductResult\']/ul/li[2]/div/div[2]/div[2]/div/a/img")).click();
	
	
	
	
	
	driver.quit();*/
	
		
	//find no of links in icicibank homepage
	
	/*ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.icicibank.com/");
	
	List<WebElement> links=driver.findElements(By.tagName("a"));
	System.out.println(links.size());
	
	for(int i=0; i<links.size();i++) {
		
	 System.out.println(links.get(i).getText());
	}*/
		
	
	//find no of links in header part walmart.com
		
	/*ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.walmart.com/");
 	
	
	WebElement header=driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div/div[1]/div[1]/div/div/div/div[1]/ul/li[1]/div/div[1]/div[2]/div/img"));
	List<WebElement> links=header.findElements(By.tagName("a"));
	
	System.out.println(links.size());*/

	
	//find all broken links in shopcloues.com
		
	
			
			
			
			
			
		}
		
		
		
		
		
			}

	
