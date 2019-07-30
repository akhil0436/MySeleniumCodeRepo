package workingwithStaticArray;

import org.testng.annotations.Test;

public class ArrayConceptDemo {
	
	
	//limitations of array:
			//1. size is fixed: static array : to overcome this problem, we use dynamic array or ArrayList
			//2. stores similar types of values: to overcome this problem, we use dynamic array or Object array
	
	@Test
	public void ArrayConceptOperations()
	{
		
		//We use different type of datatypes to create array variables
		
		//int
		
		int i[]=new int[6];
		
		i[0]=100;
		i[1]=20;
		i[2]=45;
		i[3]=234;
		i[4]=28;
		i[5]=58;
		
		System.out.println(i[5]);
		
		// System.out.println(i[8]);  //Error throws as a ArrayIndexOutOfBoundsException (Interview Quetion IMP)
		
		System.out.println(i[1]+i[4]);
		
		System.out.println(i.length);
		
		
		//double
		
		double d[]=new double[4];
		
		d[0]=10.5;
		d[1]=45.5;
		d[2]=1.5;
		d[3]=4.5;
		
		
		// System.out.println(d[4]); //Error throws as a ArrayIndexOutOfBoundsException (Interview Quetion IMP)
		
		System.out.println(d[3]+d[0]);
		
		System.out.println(d.length);
		
		
		
		//Char
		
		char c[]=new char[3];
		
		c[0]='a';
		c[1]='@';
		c[2]='$';
		
		System.out.println(c[0]);
		System.out.println(c[2]);
		System.out.println(c[0]+c[2]);   //It will take Ascii Values
		
		
		//Boolean 
		
		boolean b[]=new boolean[3];
		
		b[0]=true;
		b[1]=false;
		b[2]=true;
		
		System.out.println(b.length);
		
		System.out.println(b[2]);
	
		
		
		//String
		
		String str[]=new String[4];
		
		str[0]="Hey";
		str[1]="I am";
		str[2]="Akhil";
		str[3]="Automation Test Engineer";
		
		
		
		System.out.println(str[2]);
		
		//To print all Array variable values we use For loop concept here
		
		for(int v=0; v<str.length; v++)
		{
			System.out.print(str[v]);
			
		}
		
		System.out.println();
		
		
		
		//Object Concept
		
		Object obj[]=new Object[4];
		
		obj[0]="Hey, i am akhil"; //String 
		obj[1]='$';               //Char 
		obj[2]=10.5;              //double
		obj[3]=46;                //int
		
		System.out.println(obj[2]);
		
		for(int n=0; n<obj.length; n++)
		{
			System.out.println(obj[n]);
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
