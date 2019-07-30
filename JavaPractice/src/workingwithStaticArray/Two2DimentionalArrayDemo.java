package workingwithStaticArray;

import org.testng.annotations.Test;

public class Two2DimentionalArrayDemo {
	
	
	
	@Test
	public void Array2DimentionalOpeartions()
	{
	
	Object obj[][]=new Object[3][4];
	
	//1st Row
	
	obj[0][0]="Hey";
	obj[0][1]="I am New";
	obj[0][2]="To";
	obj[0][3]="Bangalore";
	
	
	
	//2nd Row
	
	obj[1][0]=300;
	obj[1][1]="I know";
	obj[1][2]="That";
	obj[1][3]="its Fake";
	
	
	
	//3rd Row
	
	obj[2][0]="You always";
	obj[2][1]="Best to Travel";
	obj[2][2]="Going to";
	obj[2][3]="Chennai";
	
	System.out.println(obj[2][2]);
	
	for(int row=0; row<obj.length;  row++) 
	{
		
		for(int col=0; col<obj[0].length; col++)
		{
			
			System.out.println(obj[row][col]);
			
		}
		
		
		
		
	}
	
	
	
	
	
	
	}
}

