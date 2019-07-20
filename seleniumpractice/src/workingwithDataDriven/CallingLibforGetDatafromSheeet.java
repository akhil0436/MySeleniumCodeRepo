package workingwithDataDriven;

import java.io.IOException;

import org.testng.annotations.Test;

import workingwithApachiPOI.ExcelDataConfigLibrary;

public class CallingLibforGetDatafromSheeet {
	
	
	
	@Test
	public void getdata() throws IOException
	{
	
		
		ExcelDataConfigLibrary path=new ExcelDataConfigLibrary("C:\\Users\\Welcome\\Desktop\\orangeHRMLogin.xlsx");
	
		System.out.println(path.getdatafromsheet("Sheet2", 0, 1));
	
		System.out.println(path.getdatafromsheet("Sheet2", 0, 0));
		
		System.out.println();

	
	}
	
	
}
