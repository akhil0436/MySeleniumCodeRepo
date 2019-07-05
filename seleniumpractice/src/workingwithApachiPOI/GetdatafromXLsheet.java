package workingwithApachiPOI;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GetdatafromXLsheet {



	public static void main(String[] args) throws IOException {

		FileInputStream fis=new FileInputStream("C:\\Users\\Welcome\\Desktop\\EgforApachiPOI.xlsx");
		
		XSSFWorkbook wbo=new XSSFWorkbook(fis);
		
		 XSSFSheet ws=wbo.getSheet("Sheet1");
		
		 System.out.println(ws.getRow(0).getCell(0).getStringCellValue());
		 
		 System.out.println(ws.getRow(0).getCell(1).getStringCellValue());
		 
		 System.out.println(ws.getRow(1).getCell(0).getStringCellValue());
		 
		 System.out.println(ws.getRow(1).getCell(1).getStringCellValue());
		 
		 System.out.println(ws.getRow(2).getCell(0).getStringCellValue());
		 
		 System.out.println(ws.getRow(2).getCell(1).getStringCellValue());
		 
		 System.out.println(ws.getRow(7).getCell(0).getStringCellValue());
		 
		 System.out.println(ws.getRow(7).getCell(1).getStringCellValue());
		 
		 System.out.println(ws.getRow(7).getCell(3));
		 
		Row r;
		for(int i=0; i<ws.getLastRowNum(); i++)
		{
			r=ws.getRow(i);
			for(int j=0; j<r.getLastCellNum(); j++) 
			{
			   System.out.print(r.getCell(j).getStringCellValue());
			}
			
			System.out.println();
		
			
		}
		
		 
		System.out.println("Succefully Get the data from XL Sheet");
		 
		FileOutputStream fo=new FileOutputStream("C:\\\\Users\\\\Welcome\\\\Desktop\\\\EgforApachiPOI.xlsx");
		
		wbo.write(fo);
		
	}

}
