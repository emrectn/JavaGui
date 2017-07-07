package aa;

public class Bill 
{

	Person passenger;

	public Person getPassenger() {
		return passenger;
	}

	public void setPassenger(Person passenger) {
		this.passenger = passenger;
	}
	
	public String Cost()
	{
		double totalcost=0;
		
		totalcost=0;
		
		if(passenger.getBudget().equals("Economy"))
		{
			totalcost=passenger.getNumofdays()*1000;
			totalcost+=1230;
		}
		
		if(passenger.getBudget().equals("Moderate"))
		{
			totalcost=passenger.getNumofdays()*1500;
			totalcost+=1730;
		}
		
		if(passenger.getBudget().equals("Luxury"))
		{
			totalcost=passenger.getNumofdays()*2000;
			totalcost+=2340;
		}
		
		String total1=Double.toString(totalcost);
		return total1;
	}
	
}
