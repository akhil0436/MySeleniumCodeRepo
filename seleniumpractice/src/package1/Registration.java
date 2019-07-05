package package1;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Registration123 {

	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://www.newtours.demoaut.com/");
		driver.findElement(By.linkText("REGISTER")).click();
		FileInputStream fis=new FileInputStream("C:\\Users\\Welcome\\Desktop\\data1.xlsx");
		XSSFWorkbook wbo=new XSSFWorkbook(fis);
		XSSFSheet wso=wbo.getSheet("sheet2");
		Row r;
		for(int i=0;i<=wso.getLastRowNum();i++)
		{
			r=wso.getRow(i);
			driver.findElement(By.name("firstName")).sendKeys(r.getCell(0).getStringCellValue());
			driver.findElement(By.name("lastName")).sendKeys(r.getCell(1).getStringCellValue());
			driver.findElement(By.name("phone")).sendKeys(r.getCell(2).getStringCellValue());
			driver.findElement(By.id("userName")).sendKeys(r.getCell(3).getStringCellValue());
			driver.findElement(By.name("address1")).sendKeys(r.getCell(4).getStringCellValue());
			driver.findElement(By.name("address2")).sendKeys(r.getCell(5).getStringCellValue());
			driver.findElement(By.name("city")).sendKeys(r.getCell(6).getStringCellValue());
			driver.findElement(By.name("state")).sendKeys(r.getCell(7).getStringCellValue());
			driver.findElement(By.name("country")).sendKeys("INDIA");
			driver.findElement(By.name("email")).sendKeys(r.getCell(8).getStringCellValue());
			driver.findElement(By.name("password")).sendKeys(r.getCell(9).getStringCellValue());
			driver.findElement(By.name("confirmPassword")).sendKeys(r.getCell(10).getStringCellValue());
			String sat=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/a/font/b")).getText();
			r.createCell(11).setCellValue(sat);
			
		}
		// TODO Auto-generated method stub

	}

}
	
		// TODO Auto-generated method stub

	
