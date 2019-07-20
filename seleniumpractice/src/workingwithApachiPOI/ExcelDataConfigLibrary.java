package workingwithApachiPOI;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataConfigLibrary {
	
	
	
	FileInputStream fis;
	
	XSSFWorkbook wbo;
	
	XSSFSheet sheetNum;
	
	
	public ExcelDataConfigLibrary(String ExcelPath) throws IOException
	
	{
		
		
	 try 
	 {
		fis=new FileInputStream(ExcelPath);
		
		 wbo=new XSSFWorkbook(fis);
		
	 } 
	 catch (Exception e) 
	 {

		System.out.println(e.getMessage());
	 }
	 
	}
	
	

	 
	 public String getdatafromsheet(String sheetdetails,int row,int column)
	 {
		
		 sheetNum=wbo.getSheet(sheetdetails);

		 String usetocalldata=sheetNum.getRow(row).getCell(column).getStringCellValue();
		 
		 return usetocalldata;
	 }




}	 

