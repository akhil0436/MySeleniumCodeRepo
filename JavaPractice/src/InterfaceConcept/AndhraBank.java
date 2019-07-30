package InterfaceConcept;

public class AndhraBank implements GovtCentralBankofIndia, CBI_Rules{
	
	//if a class is implements a interface, then its mandatory to define/override its all methods of interface.
	

	@Override
	public void Credit() {
		System.out.println("AndhraBank--Credit Details");
		
	}

	@Override
	public void Debit() {
		System.out.println("AndhraBank--Debit Details");		
	}

	@Override
	public void TransferMoney() {
		System.out.println("AndhraBank--Transfer Money Details");		
	}

	@Override
	public void Min_Bal() {
		System.out.println("AndhraBank--Min_Bal Details");		
	}

	public void AndhraBankMoneySecurity()
	{
		
		System.out.println("AndhraBank --Money Security System");
		
	}
	
	public void AndhraBankHomeLoan()
	{
		
		System.out.println("AndhraBank --Home Loan Details");
		
	}
	
	public void AndhraBankCarLoan()
	{
		
		System.out.println("AndhraBank --CarLoan Details");
		
	}

	//This below override methods from CBI_Rules Interface. 
	
	@Override
	public void IncomeTax() {
		
		
	}

	@Override
	public void GST() {
		
		
	}

	@Override
	public void HumanRights() {
		
		
	}
	
	
}


