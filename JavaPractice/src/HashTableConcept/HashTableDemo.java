package HashTableConcept;

import java.util.Hashtable;

public class HashTableDemo {

	public static void main(String[] args) {

		
		
		Hashtable h=new Hashtable();
		
		h.put("a", "Tom");
		h.put("b", "Jery");
		
		System.out.println(h.get(1));
		
		System.out.println(h.size());
		
		h.put(1, 254);
		
		h.put(2, 24);
		
		System.out.println(h.size());
		
		Hashtable<Integer, String> h1=new Hashtable<Integer, String>();
		
		h1.put(1, "Akhil");
		
		h1.put(2, "jack");
		
		h1.put(3, "racky");
		
		h1.put(4, "joe");
		
		h1.put(5, "john");
		
		System.out.println(h1.size());
		
		for(int j=0; j<h1.size(); j++)
		{
			
			System.out.println(h1.get(j));
			
			
			
		}
		
		
		
		
		
		
	}

}
