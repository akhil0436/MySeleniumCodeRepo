package workingwithCheckBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlewithCheckBox {

	public static void main(String[] args) {

		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		
		WebElement student=driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount"));
		
		student.click();
		
		if(student.isSelected()) {
			
			System.out.println("Student checkbox is active");
		}
		else {
			
			System.out.println("inactive");
		}
	}

}


