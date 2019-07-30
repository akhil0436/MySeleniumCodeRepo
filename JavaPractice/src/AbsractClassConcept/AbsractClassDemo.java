package AbsractClassConcept;

public abstract class AbsractClassDemo {
	
	//partial abstraction
	//hidding the implementation of the logic or statements of the methods is called abstract.
	//abs class can have a abs methods and non abs methods.
	
	public abstract void Loans();
	
	
	
	//non-abs methods
	public void carloans()
	{
		
		System.out.println("car loans");
		
	}
	
	public void homeloans()
	{
		
		System.out.println("Home loans");
		
	}
	

}
