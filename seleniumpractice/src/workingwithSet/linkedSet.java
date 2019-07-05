package workingwithSet;

import java.util.LinkedHashSet;

public class linkedSet {

	public static void main(String[] args) {

		LinkedHashSet<String> values=new LinkedHashSet<String>();
		
		
		values.add("selenium");
		values.add("Automation");
		values.add("Test");
		values.add("Engineer");
		values.add("EmpId");
		values.add("EmpName");
		values.add("Salary");
		values.add("Location");
		
		for(String e:values) 
		{
			
			System.out.println(e);
			
		}
		
	}

}
