package LinkedListConcept;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {

	  LinkedList<String> ll=new LinkedList<String>();
	  
	  ll.add("Tom");
	  ll.add("QA");
	  ll.add("Dept");
	  ll.add("Loc");
	  ll.add("Addrs");
		
	  System.out.println(ll);
	  
	  //addfirst
	  
	  ll.addFirst("Akhil");
	  
	  //addlast
	  
	  ll.addLast("America");
	  
	 System.out.println(ll);
	 
	 //To print all values with using For loop
	 System.out.println("To print all values with using For loop");

	 for(int i=0; i<ll.size(); i++)
	 {
		 System.out.println(ll.get(i));
		 
	 }
	 
	 //Advance for loop 
	 
	 System.out.println("Advance for loop");
	 
	 for(String str:ll)
	 {
		 
		 System.out.println(str);
		 
		 
	 }
	 
	 
	 //To print print all values with using Iterator.
	 System.out.println("To print print all values with using Iterator");
	 
	 Iterator<String> it=ll.iterator();
	 while(it.hasNext())
	 {
		 String iter=it.next();
		 System.out.println(iter);
		 
		 
		 
	 }
	 

	}

}
