package FinalvsFinallyvsFinalizeConcepts;

public class parent {
	
	//to prevent method override with using final keyword 

	public final void start()  // It can not be inherit the parent methods to child class
	{
		
		System.out.println("this is child class");
		
	}
	
}
