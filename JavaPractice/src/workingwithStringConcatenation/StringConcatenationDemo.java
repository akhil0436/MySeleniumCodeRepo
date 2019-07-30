package workingwithStringConcatenation;

import org.testng.annotations.Test;



//+ is Concatenation Operator
//Println is used to print on console with a new line
//Print is used to print on console


public class StringConcatenationDemo {
	
	
	@Test
	public void StringConcenationWays()
	{
		
		int a=100;
		int b=200;
		
		
		String x="Akhil"; 
		String y="AutomationTester";
		
		double d1=10.6;
		double d2=9.6;
		
		
		
		
		System.out.println(a+b);
		System.out.println(x+y);
		
		System.out.println(a+b+x+y);
		
		System.out.println(x+y+a+b);
		
		System.out.println(x+a+y+b);
		
		System.out.println(x+y+(a+b));
		
		System.out.println(x+y+"  "+d1+d2); //still not count d1,d2 values
		
		System.out.println(d1+x+a+(d1+d2));
		
		System.out.println(d1+d2+"   "+(a+b)+x+"  "+y);
		
		System.out.println(d1+d2+(a+b)+x+"  "+y);
		
		
		
		
		
		System.out.println("The value of a is"+a);
		
		System.out.println("The value of b is"+b);
		
		System.out.println("The value of x is"+x);
		
		System.out.println("The value of y is"+y);
		
		System.out.println("The value of d1 is"+d1);
		
		System.out.println("The value of d2 is"+d2);
		
		
		
		
		
		
		
	}
	
	

}
