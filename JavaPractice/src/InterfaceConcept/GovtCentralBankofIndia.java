package InterfaceConcept;

public interface GovtCentralBankofIndia {
	
	int MinBalanceis=500;
	
	public void Credit();
	
	public void Debit();
	
	public void TransferMoney();
	
	public void Min_Bal();
	
	
	//Only method declartion
	//No method body or statements under the method
	//In interface we can store variables, vars are default static in nature.
	//Vars will not be changed.
	//No main method in interface.
	//We can not create an object of interface.
	//No static methods in interface.

}
