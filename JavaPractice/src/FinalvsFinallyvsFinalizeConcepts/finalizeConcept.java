package FinalvsFinallyvsFinalizeConcepts;

public class finalizeConcept {
	
	//Finalize() is the method in java which called by the garbage collector. 
	//It is used to perform cleanup in system.
	
	public void finalize()
	{
		
		System.out.println("This is finalize method");
	}

	public static void main(String[] args) {

		
		finalizeConcept f1=new finalizeConcept();
		finalizeConcept f2=new finalizeConcept();
		
		f1=null;
		
		System.gc();
	}

}
