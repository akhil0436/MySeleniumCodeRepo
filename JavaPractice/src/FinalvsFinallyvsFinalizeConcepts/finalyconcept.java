package FinalvsFinallyvsFinalizeConcepts;

public class finalyconcept {


	public static void main(String[] args) {

		test1();
	}
	
	
	public static void test1()
	{
		
		try {
			System.out.println("this is test1 method");
		} 
		catch (Exception e) 
		{

			System.out.println("this is under catch block"+e.getMessage());
			
		}
		finally 
		{
			System.out.println("this is finally printed");
			
		}
		
		
	}
	

}
