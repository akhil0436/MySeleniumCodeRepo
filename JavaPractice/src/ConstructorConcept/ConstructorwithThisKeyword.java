package ConstructorConcept;

public class ConstructorwithThisKeyword {
	
	
	public ConstructorwithThisKeyword()
	{
		
		System.out.println("This is default contructor");
		
	}
	
	public ConstructorwithThisKeyword(int sal)
	{
		
		System.out.println("the salary is---"+sal);
		
	}
	public ConstructorwithThisKeyword(String name, int idnum)
	{
		
		System.out.println("This is constructor3 with name"+name+idnum);
		System.out.println("This is constructor3 with idnum"+idnum);
	}
	
	
	

	public static void main(String[] args) {
		
		ConstructorwithThisKeyword obj=new ConstructorwithThisKeyword();
		
		ConstructorwithThisKeyword obj1=new ConstructorwithThisKeyword(54000);
		
		ConstructorwithThisKeyword obj2=new ConstructorwithThisKeyword("Tom", 12453);

	}

}
