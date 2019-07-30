package ArrayListConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {

		
		ArrayList ar=new ArrayList();
		
		ar.add("Tom"); //0
		ar.add(200);   //1
		ar.add('h');   //2
		ar.add("Salary"); //3
		ar.add(55000);  //4
		
		System.out.println(ar.size()); 
		
		ar.add("google");  //5
		ar.add("Flipkart"); //6
		ar.add("NTT");  //7
		
		System.out.println(ar.size());
		
		System.out.println(ar.get(4));
		
		//to print all the ar values use for loop
		
		for(int i=0; i<ar.size(); i++)
		{
			System.out.println(ar.get(i));
			
		}
		
		
		ArrayList<Integer> ar1=new ArrayList<Integer>(); //it take only integer values
		
		ar1.add(100); //0
		ar1.add(899); //1
		ar1.add(900); //2
		
		System.out.println(ar1.size());
		
		System.out.println(ar1.get(1));
		
		ArrayList<String> ar2=new ArrayList<String>();
		
		ar2.add("Jerry");
		ar2.add("Spider");
		
		System.out.println(ar2.size());
		
		
		//create object for EmployeeDetails class //under EmployeeDetails create constructer.
		
		EmployeeDetails emp1=new EmployeeDetails("Tom", "QA", 48000);
		
		EmployeeDetails emp2=new EmployeeDetails("jery", "Dev", 48000);
		
		EmployeeDetails emp3=new EmployeeDetails("Tom", "Architech", 48000);
		
		
		ArrayList<EmployeeDetails> aremp=new ArrayList<EmployeeDetails>();
		
		aremp.add(emp1);
		aremp.add(emp2);
		aremp.add(emp3);
		
		//Use Iterator to print values
		
		Iterator<EmployeeDetails> it=aremp.iterator();
		
		while(it.hasNext()) 
		{
			EmployeeDetails prntemp=it.next();
			
			System.out.println(prntemp.name);
			
			System.out.println(prntemp.dept);
			
			System.out.println(prntemp.sal);
			
		}
		
		System.out.println("************************");
		
		
		//addall 
		
      ArrayList<String> ar4=new ArrayList<String>();
		
		ar4.add("Jerry");
		ar4.add("Spider");
		
		
      ArrayList<String> ar5=new ArrayList<String>();
		
		ar5.add("Jerry");
		ar5.add("Spider");
		
		ar4.addAll(ar5);
		
		for(int a=0; a<ar4.size(); a++)
		{
			
			System.out.println(ar4.get(a));
			
			
		}
		
		
	}

}
