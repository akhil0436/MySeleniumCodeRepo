package workingwithLoopsConcepts;

import org.testng.annotations.Test;

/**
 * @author Welcome
 *
 *
 * There are 2 ways for Looping like
 * 
 * 1)with "while" loop
 * 2)with "For" loop
 *
 *
 */
public class LoopConceptsDemo {
	
	@Test
	public void LoopConceptOperations()
	{
		
		//with while loop
		
		int i=1;
		while(i<=10)
		{
			
			System.out.println(i);
			i=i+1;
			
		}
		
		
		//with For loop
		
		for(int j=1; j<=15; j++)
		{
			System.out.println(j);
			
		}
		
	}
	
	
	

}
