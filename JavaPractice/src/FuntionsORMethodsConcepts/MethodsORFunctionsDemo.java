package FuntionsORMethodsConcepts;

public class MethodsORFunctionsDemo {

	public static void main(String[] args) { 
		
		
		MethodsORFunctionsDemo obj=new MethodsORFunctionsDemo();
		
		//'MethodsORFunctionsDemo' is a class
		// 'obj' is a object refference variable 
		//'new MethodsORFunctionsDemo()' is a object with New keyword
		//the main method returns only void return type and its not return any other value
		
		obj.Method1();
		
		int m=obj.Method2();
		System.out.println(m);
		
		String n=obj.Method3();
		System.out.println(n);
		
		
		int div=obj.Method4(20, 30);
		System.out.println(div);
	}
	
	
     public void Method1() //Return type is Void and Void doesn't return any value.
         {
	
	System.out.println("This is Method No -1");
	
        }



public int Method2()  //heare return value is int.
{
	
 System.out.println("This is Method No -2");
	
	int a=20;
	int b=44;
	int c=a+b;
	
	return c;
	
}

public String Method3()   //here return method type is String
{
	
	System.out.println("This is Method No -3");
	
	String s="Greetings from xyz pvt ltd";
	
	return s;
	
}
public int Method4(int x, int y) //Passing parameters/arguments into the method
{

	System.out.println("This is Method No -4");
	
	int answer=x/y;
	
	return answer;

}
	
	

}
