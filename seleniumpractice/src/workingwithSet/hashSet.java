package workingwithSet;

import java.util.HashSet;

public class hashSet {

	public static void main(String[] args) {
		
		
		HashSet<String> values=new HashSet<String>();
		
		
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
