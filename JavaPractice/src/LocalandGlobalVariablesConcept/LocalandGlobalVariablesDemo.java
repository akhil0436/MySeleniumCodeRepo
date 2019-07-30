package LocalandGlobalVariablesConcept;

public class LocalandGlobalVariablesDemo {
	
	
	String Role="Automation Test Engineer";  //Global Variables
    int sal=55000;                           //Global Variables
    

	public static void main(String[] args) {

		
		int i=28;   //Local Variables
		System.out.println(i);
		
		
		//If we want to call global variables under the main method we have to create object for that class
		LocalandGlobalVariablesDemo obj=new LocalandGlobalVariablesDemo();
		System.out.println(obj.Role);
		
		obj.jobdescription();
		
	}
	
	
	
	
	public void jobdescription()
	{
		
		String description="Maintain all the testing activities";  //Local Variables
		System.out.println(description);
		
		System.out.println("Salary is -"+"   "+sal); //this is non static method so we can call the global variables easily.
		
		
		
		
	}

}
