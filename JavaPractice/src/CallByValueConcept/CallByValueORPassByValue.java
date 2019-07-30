package CallByValueConcept;

public class CallByValueORPassByValue {

	public static void main(String[] args) {

		CallByValueORPassByValue obj=new CallByValueORPassByValue();
		
		int a=30;
		int b=20;
		obj.sum(a,b); //Call by value or Pass by value.
		
	}

	public int sum(int i, int j)
	{
	
		int c=i+j;
		
		return c;
		
	}
	
}
