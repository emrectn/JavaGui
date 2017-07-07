package aa;

public class Insurance 
{
	Person kisi;
	private String name;

	public Insurance()
	{
		this.kisi=kisi;
		this.name=name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public double calculateCost()
	{
		double cost=0;
		if(kisi.getBudget().equals("economic"))
		cost=1210;
		else if(kisi.getBudget().equals("moderate"))
		cost=2700;
		else if(kisi.getBudget().equals("luxury"))
		cost=4200;
		return cost;
	}
	
}
