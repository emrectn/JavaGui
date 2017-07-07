package aa;


public class Person 
{
	private String name,surname,selectedContinent,selectedCoutry,mail,vacationtype,route;
	Insurance ins;
	private String budget;
	private int numofdays;
	
	Bill faturam;
	
	public Person()
	{
		this.ins=ins;
		this.name=name;
		this.surname=surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Insurance getIns() {
		return ins;
	}

	public void setIns(Insurance ins) {
		this.ins = ins;
	}

	public String getSelectedContinent() {
		return selectedContinent;
	}

	public void setSelectedContinent(String selectedContinent) {
		this.selectedContinent = selectedContinent;
	}

	public String getSelectedCoutry() {
		return selectedCoutry;
	}

	public void setSelectedCoutry(String selectedCoutry) {
		this.selectedCoutry = selectedCoutry;
	}

	public String getBudget() {
		return budget;
	}

	public void setBudget(String budget) {
		this.budget = budget;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getVacationtype() {
		return vacationtype;
	}

	public void setVacationtype(String vacationtype) {
		this.vacationtype = vacationtype;
	}
	
	public String getRoute() {
		return route;
	}

	public void setRoute(String route) {
		this.route = route;
	}

	public String toString()
	{
		String intro="MY-TRIP-PLAN--"+"\nNAME:"+getName()+"\n SURNAME:"+getSurname()+"\n SECILENKITA:"+getSelectedContinent()+
					  "\n SECILENULKE:"+getSelectedCoutry()+"\n MAIL"+getMail()+"\n VACATIONTYPE:"+getVacationtype()+
					  "\n NUMBEROFDAYS:"+getNumofdays()+"\n ROUTE:"+getRoute()+"\n INSURANCE:"+getIns().getName()+
					  "\n BUDGET:"+getBudget();
		return intro;
	}

	public int getNumofdays() {
		return numofdays;
	}

	public void setNumofdays(int numofdays) {
		this.numofdays = numofdays;
	}

	public Bill getFaturam() {
		return faturam;
	}

	public void setFaturam(Bill faturam) {
		this.faturam = faturam;
	}
	
	
	public double mycost()
	{
		if(getBudget().equals("Economy"))
			return 11.21;
		return 3;
	}
	
}



