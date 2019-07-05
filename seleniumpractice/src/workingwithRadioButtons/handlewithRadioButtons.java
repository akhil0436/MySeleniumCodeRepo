package workingwithRadioButtons;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlewithRadioButtons {

	public static void main(String[] args) {

	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.mercurytravels.co.in/");
	
	List<WebElement> radiobtn=driver.findElements(By.xpath("//input[@type='radio']"));
	
	System.out.println(radiobtn.size());
	
	
	for(int i=0; i<radiobtn.size(); i++) {
		
		String rtext=radiobtn.get(i).getAttribute("name");
				
                if(radiobtn.get(i).isSelected()) {
	
	    System.out.println(rtext+"  "+"Active");
}		
		
		
		
		
	}
		
		
	}

}
