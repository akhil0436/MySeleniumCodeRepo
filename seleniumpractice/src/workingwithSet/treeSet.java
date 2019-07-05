package workingwithSet;

import java.util.HashSet;
import java.util.TreeSet;

public class treeSet {

	public static void main(String[] args) {

		
		TreeSet<String> values=new TreeSet<String>();
		
		
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
