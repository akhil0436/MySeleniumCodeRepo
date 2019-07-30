package workingwith_If_Else;

import org.testng.annotations.Test;

public class If_ElseDemo {
	
	@Test
	public void IfElseOpeartions()
	{
		
		int a=100;
		int b=120;
		
		if(a>b)
		{
			
		System.out.println("a is big");	
			
		}
		else
		{
			System.out.println("b is big");
			
		}
		
		//Comparision Operators 
		// <, >, <=, >=, =, ==,!= 
		
		
		int c=40;
		int d=80;
		
		if(c==d)
		{
			System.out.println("Both values are Equal");
			
		}
		else
		{
			
			System.out.println("Both values are not Equal");
			
		}
		
		
		int a1=20;
		int b1=40;
		int c1=60;
		
		if(a1>b1 & a1>c1)
		{
			
			System.out.println("a1 is big");
		}
		else if(b1>c1)
		{
			System.out.println("b1 is big");
			
		}
		else
		{
		
			System.out.println("c1 is big");
		}
		
		
		
	}

}
