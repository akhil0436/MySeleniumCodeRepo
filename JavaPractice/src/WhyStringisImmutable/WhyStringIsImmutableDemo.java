package WhyStringisImmutable;

public class WhyStringIsImmutableDemo {

	public static void main(String[] args) {

		
		String s1="java";
		
		String s2="java";
		
		String s3="Ruby";
		
		s2="akhil"; // now it will print akhil ..earlier it will print java
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		
		
	}

}
