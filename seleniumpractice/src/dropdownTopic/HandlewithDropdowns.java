package dropdownTopic;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlewithDropdowns {

	public static void main(String[] args) throws InterruptedException {
      ChromeDriver driver=new ChromeDriver();
      driver.get("https://www.mercurytravels.co.in/");
      List<WebElement> list=driver.findElements(By.tagName("select"));
      System.out.println("No of dropdowns in these page are "+"  "+list.size());
      
     
      for(int i=0; i<list.size(); i++) {
    		
    		String drpdwn=list.get(i).getText();
    		System.out.println("List of DropDown Text "+" "+drpdwn);
    		
      }

      
      WebElement dropdown=driver.findElement(By.id("themes"));
      
      WebElement getdrpdwnUnderValues=driver.findElement(By.id("themes"));
     List<WebElement> val=getdrpdwnUnderValues.findElements(By.tagName("option"));
     System.out.println("No of values under the holiday dropdown are"+val.size());
     
     
     for(int i=0;i<val.size(); i++) {
    	 
    	 String val1=val.get(i).getText();
    	 
    	 System.out.println("No of values text under the holiday dropdown"+"   "+val1 );
    	 
     }
      
Select obj=new Select(dropdown);
obj.selectByIndex(3);

Thread.sleep(5000);

Select value=new Select(dropdown);
value.selectByValue("14");


Thread.sleep(5000);

Select visible=new Select(dropdown);
visible.selectByVisibleText("Family");
 
driver.close();
	}
}

/*select values from dropdowns and verify wether it is active or inavtive
		
		ChromeDriver driver=new ChromeDriver();
	    driver.get("https://www.mercurytravels.co.in/");
        driver.manage().window().maximize();
  
  
  
WebElement d1=driver.findElement(By.id("themes"));
List<WebElement> listvalues=d1.findElements(By.tagName("option"));
for(int i=0; i<listvalues.size(); i++) {
	
	String drp=listvalues.get(i).getText();
	 
	listvalues.get(i).click();
	
	if(listvalues.get(i).isDisplayed()) {
		
		
		System.out.println(drp+"   "+"Active");
		
	}
	else {
		
		System.out.println(drp+"  "+"Inactive");
	}
	
	
	
	driver.close();
}

	
	}

}*/
