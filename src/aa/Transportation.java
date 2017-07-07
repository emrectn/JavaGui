package aa;

public class Transportation 
{

Person passenger;

public Person getPassenger() {
	return passenger;
}

public void setPassenger(Person passenger) {
	this.passenger = passenger;
}

public String benefitsofRoad()
{
	String road="ONERILEN ULASIM YOLLARI";
	if(passenger.getBudget().equals("Economy"))
	{
		road="BUS";
	}
	
	if(passenger.getBudget().equals("Moderate"))
	{
		road="TRAIN";
	}
	
	if(passenger.getBudget().equals("Luxury"))
	{
		road="PLANE";
	}
	
	return road;
}
	
}
