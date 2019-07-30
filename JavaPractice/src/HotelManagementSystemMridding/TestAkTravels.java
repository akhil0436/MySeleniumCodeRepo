package HotelManagementSystemMridding;

public class TestAkTravels {
	
	//MethodoverRidding- When same methods is present in parent class and as well as in child class with same names and same arguments/param is called method overridding.

	public static void main(String[] args) {
		
		
		//This is called Static Polymorphism or Compile-time Polymorphism  

		AkTravels obj=new AkTravels();
		
		obj.Holidays();  //Prefference will be given to Overridden method(means child method)
		//It will call child class method becoz java compiler see first in child class if it is available- 
		//-it will access,no need to take from parent class if the method is available in child class.
		
		
		obj.AkTravelPrices();
		obj.BookingCancelled();
		obj.FlightBookings();
		obj.SpecialOffers();
		obj.TrackingSystemAkTravels();
		
		
		HotelManagementSystem hms=new HotelManagementSystem();
		
		hms.Holidays();
		hms.FlightBookings();
		hms.SpecialOffers();
		hms.BookingCancelled();
	
		
		//Top Casting- Child class object can be reffered by parent class refference variable. 
		HotelManagementSystem hms1=new AkTravels(); //Dynamic Polymorphism or Run-time Polymorphism
		
		hms1.Holidays();  //Here we cant acess the child class(AKtravels) methods, it acess only overriden method.
		
		
		
		//Down Casting- 
		
		AkTravels akt=(AkTravels)new HotelManagementSystem(); //But it throws a error called ClassCastException
		
		
	}

}
