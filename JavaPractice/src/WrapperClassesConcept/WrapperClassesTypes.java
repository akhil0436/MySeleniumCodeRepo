package WrapperClassesConcept;

public class WrapperClassesTypes {

	public static void main(String[] args) {

		//Wrapper Classes - its a conversion of datatypes .
		//like int, String, Char, Float, Double..etc
		
		
		//String to int conversion
		String x="200";
		
		System.out.println(x+20);
		
		int i=Integer.parseInt(x);
		System.out.println(i+20);
		
		
		
		//int to string conversion
		
		int a=100;
		
		System.out.println(a+20);
		
		String s=String.valueOf(a);
		
		System.out.println(s+20);
		
		
		//string to boolean conversion
		
		String b="True";
		
		System.out.println(b);
		
		
		Boolean bl=Boolean.parseBoolean(b);
		
		System.out.println(bl);
		
		
		
		String error="100a"; //its not a proper stringformate
		
	    int gh=Integer.parseInt(error); //It throws an error called java.lang.NumberFormatException 
		
	    System.out.println(gh);
		
		
		
	}

}
