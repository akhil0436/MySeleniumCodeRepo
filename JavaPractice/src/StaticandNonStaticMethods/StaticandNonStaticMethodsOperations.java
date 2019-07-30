package StaticandNonStaticMethods;

public class StaticandNonStaticMethodsOperations {

	int i=20; //Non-Static global variable
	static String EmpName="Syed Akhil";  //Static global variable
	
	public static void main(String[] args) {
		
		
		//How to call static methods and variables? there is 2 ways,
		//1)Direct Calling
		
		flipkart();
	   
		//Calling with ClassName,
		
		StaticandNonStaticMethodsOperations.flipkart();
		
		//Calling static method variables 
		System.out.println(EmpName);
		System.out.println(StaticandNonStaticMethodsOperations.EmpName);
		
		
		
		//If we want to call Non-Static methods and variables we have to create object for class
		
		StaticandNonStaticMethodsOperations obj=new StaticandNonStaticMethodsOperations();
		
		obj.amazon();
		obj.ebay();
		obj.jabong();
		obj.shopcluse();
		
		System.out.println(obj.i);
		
		//can i access the static method by using object refference? 
		//ans- Yes, but its not a good practice becoz,
		//no need to create object for calling static methods its already available in static way.we can call static methods with directlly and with className.
		
		flipkart();
	
	}
	
	public static void flipkart()
	{
		
		
		System.out.println("This method is all about flipkart");
		
		
	}
	public void shopcluse()
	{
		
		System.out.println("This method is all about ShopCluse");
		
	}
	public void jabong()
	{
		
		System.out.println("This method is all about jabong");
		
	}
	public void ebay()
	{
		
		System.out.println("This method is all about ebay");
	
	}
	public void amazon()
	{
		
		System.out.println("This method is all about amazon");
		
	}

}
