package workingwithImages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlewithImages {

	public static void main(String[] args) {

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/");
		
		
		List<WebElement> img=driver.findElements(By.tagName("img"));
		
		
		System.out.println(img.size());

		
		for(int i=0; i<img.size(); i++) {
			
			String href=img.get(i).getAttribute("src");
			
					
					
			System.out.println(href);
			

			
		}
	}

}
