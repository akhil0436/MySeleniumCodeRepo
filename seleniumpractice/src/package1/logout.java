package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class logout {

	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.className("button")).click();
		Sleeper.sleepTightInSeconds(4);
		driver.findElement(By.linkText("PIM")).click();
		//driver.findElement(By.xpath("//*[@id=\'welcome\']")).click();
		//driver.findElement(By.xpath("//*[@id=\'welcome-menu\']/ul/li[2]/a")).click();
		// TODO Auto-generated method stub
		driver.findElement(By.id("menu_pim_addEmployee")).click();
		driver.findElement(By.id("firstName")).sendKeys("yesh");

	}

}
