package MethodoverLoadingConcept;

public class methodoverloadingDemo {
	
	//MethodoverLoading - same method names with different parameters/arguments under the same class
	//We can also overload main method.but with different param.
	//We can not create a method inside the method.
	//Duplicate methods - same method name and same input parameters with same datatypes is not allowed.
	
	

	public static void main(String[] args) {

		
		System.out.println("This is static void main method1");
		
	}
	
	public static void main(String x) 
	{
		System.out.println("This is static void method -2 with different param like string");
		
		
	}
	public static void main(int y) 
	{
		System.out.println("This is static void method -3 with different param like int");
		
		
	}
	
	
	//Non-Static methods
	
	
	public void sum() //without parameters/arguments
	{
		
		System.out.println("this is sum method without param");
		
	}
	public void sum(int i) //1 input param
	{
		
		System.out.println("This is sum method with int datatype input parameters");
		
	}
	public void sum(String schoolname)   //1 input param
	{
		
		System.out.println("This is sum method with string datatype input parameters");
		
		
	}
	public void sum(String x, int empid)  //2 input param
	{
		
		System.out.println("This is sum method with string and int datatype input parameters");
		
	}

}
