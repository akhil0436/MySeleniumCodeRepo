package OopsConceptsPart1;

import org.testng.annotations.Test;

public class ClassesandObjectsDemo {
	
	String flipkart="Online Store";
	
	String APSRTC="Govt Road Transport";
	
	@Test
	public void ClassesandObjectOperations()
	{
		//new ClassesandObjectsDemo(); is a Object for ClassesandObjectsDemo Class
		// 'a, b, c' is a object refference variable
		// 'new' is a keyword used to create an object for class
		
		ClassesandObjectsDemo a=new ClassesandObjectsDemo();
		
		ClassesandObjectsDemo b=new ClassesandObjectsDemo();
		
		ClassesandObjectsDemo c=new ClassesandObjectsDemo();
		
		a.flipkart="Flipkart is a online shopping store";
		
	    a.APSRTC="APSRTC stands for Andhra Pradesh Road Transport Corporation";
	    
	    
	    b.flipkart="shopping store";
		
	    b.APSRTC="Transport Corporation";
	    
	    
	    c.flipkart="Flipkart is";
		
	    c.APSRTC="APSRTC stands";
		
	    
	    
	    
	    System.out.println(a.flipkart);
	    System.out.println(a.APSRTC);
	    
	    
	    System.out.println(b.flipkart);
	    System.out.println(b.APSRTC);
	    
	    
	    System.out.println(c.flipkart);
	    System.out.println(c.APSRTC);
		
		
	}
	
	

}
