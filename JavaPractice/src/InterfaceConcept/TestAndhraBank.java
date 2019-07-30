package InterfaceConcept;

public class TestAndhraBank {

	public static void main(String[] args) {

		System.out.println(GovtCentralBankofIndia.MinBalanceis);
		
		
		AndhraBank ab=new AndhraBank();
		
		ab.Credit();
		ab.Debit();
		ab.Min_Bal();
		ab.TransferMoney();
		
		ab.AndhraBankCarLoan();
		ab.AndhraBankHomeLoan();
		ab.AndhraBankMoneySecurity();
		
		
		
		//Dynamic Polymerphism-
		//Child class object can be reffered by parent interface refference variable.
		
		
		GovtCentralBankofIndia gcbi=new AndhraBank();  //override methods can be only acess.
		
		gcbi.Credit();
		gcbi.Debit();
		gcbi.Min_Bal();
		gcbi.TransferMoney();  //here we can not acess andhrabank methods
		
		
		
	}

}
