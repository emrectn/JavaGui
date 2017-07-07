package aa;

public class Accomodation
{

Person passenger;

public String benefits()
{
	String benefits="";
	if(passenger.getBudget().equals("Economy"))
	{
		benefits+="SABAH KAHVALTISI"+"--"+"AKSAM YEMEGI";
	}
	
	if(passenger.getBudget().equals("Moderate"))
	{
		benefits+="SABAH KAHVALTISI"+"--"+"AKSAM YEMEGI"+"--"+"OTEL ICI ETKINLIKLER";
	}
	
	if(passenger.getBudget().equals("Luxury"))
	{
		benefits+="SABAH KAHVALTISI"+"--"+"AKSAM YEMEGI"+"--"+"OTEL ICI ETKINLIKLER"+"--"+"GECE ETKINLIKLERI";
	}
	
	return benefits;
}

public Person getPassenger() {
	return passenger;
}

public void setPassenger(Person passenger) {
	this.passenger = passenger;
}

}
