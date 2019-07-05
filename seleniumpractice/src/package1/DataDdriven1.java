package package1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DataDdriven1 {

	public static void main(String[] args) throws IOException, InterruptedException {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		FileInputStream fis=new FileInputStream("C:\\Users\\Welcome\\Desktop\\data1.xlsx");
		XSSFWorkbook wbo=new XSSFWorkbook(fis);
		XSSFSheet wso=wbo.getSheet("sheet1");
		Row r;
		for(int i=0;i<=wso.getLastRowNum();i++)
		{
			r=wso.getRow(i);
			//System.out.println(r);
			System.out.println(wso.getLastRowNum());
			driver.findElement(By.id("txtUsername")).sendKeys(r.getCell(0).getStringCellValue());
			driver.findElement(By.id("txtPassword")).sendKeys(r.getCell(1).getStringCellValue());
			driver.findElement(By.id("btnLogin")).click();
			//String sat=driver.findElement(By.id("welcome")).getText();
			//r.createCell(3).setCellValue(sat);
			String dat=driver.getCurrentUrl();
			r.createCell(4).setCellValue(dat);
			if(dat.equals(r.getCell(2).getStringCellValue()))
					{
				r.createCell(5).setCellValue("pass");
				
					}
			else
			{
				r.createCell(5).setCellValue("fail");
			}
			//driver.findElement(By.linkText("Welcome Admin")).click();
			//driver.findElement(By.linkText("Logout")).click();
				
			driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");
			Thread.sleep(3000);
			
			
		}
		FileOutputStream fos=new FileOutputStream("C:\\Users\\Welcome\\Desktop\\data1.xlsx");
		wbo.write(fos);
		driver.close();
		// TODO Auto-generated method stub

	}

}
