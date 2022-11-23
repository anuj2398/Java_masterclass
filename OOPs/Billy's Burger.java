package BillysBurgers;

public class Hamburger {
	private String name;
	private String meat;
	private double price;
	private String breadRollType;

public Hamburger(String name,String meat,double price,String breadRollType) {
	this.name=name;
	this.meat=meat;
	this.price=price;
	this.breadRollType=breadRollType;
}
private String addition1Name;
private double addition1Price;

private String addition2Name;
private double addition2Price;

private String addition3Name;
private double addition3Price;

private String addition4Name;
private double addition4Price;

public void addHamburgerAddition1(String name, double price) {
	this.addition1Name=name;
	this.addition1Price=price;
}
public void addHamburgerAddition2(String name, double price) {
	this.addition2Name=name;
	this.addition2Price=price;
}
public void addHamburgerAddition3(String name, double price) {
	this.addition3Name=name;
	this.addition3Price=price;
}
public void addHamburgerAddition4(String name, double price) {
	this.addition4Name=name;
	this.addition4Price=price;
}

public double itemizeHamburger() {
	double hamburgerPrice= this.price;
	System.out.println(this.name + " hamburger "+" on a " +this.breadRollType +" roll "+"price is"+this.price);
	
	if(this.addition1Name!=null) {
		hamburgerPrice += this.addition1Price;
		System.out.println("Added "+this.addition1Name+" for an extra "+this.addition1Price);
	}
	if(this.addition2Name!=null) {
		hamburgerPrice += this.addition1Price;
		System.out.println("Added "+this.addition2Name+" for an extra "+this.addition2Price);
	}
	if(this.addition3Name!=null) {
		hamburgerPrice += this.addition3Price;
		System.out.println("Added "+this.addition3Name+" for an extra "+this.addition3Price);
	}
	if(this.addition4Name!=null) {
		hamburgerPrice += this.addition4Price;
		System.out.println("Added "+this.addition4Name+" for an extra "+this.addition4Price);
	}
	
	return hamburgerPrice;
}

}


package BillysBurgers;

public class HealtyBurger extends Hamburger{
	private String healthyExtra1Name;
	private double healthyExtra1Price;
	
	private String healthyExtra2Name;
	private double healthyExtra2Price;
	public HealtyBurger(String meat, double price) {
		super("Healthy", meat, price,"Brown rye");
	}
	
	public void addHealthAddition1(String name,double price) {
		this.healthyExtra1Name=name;
		this.healthyExtra1Price=price;
	}
	public void addHealthyAddition2(String name,double price) {
		this.healthyExtra2Name=name;
		this.healthyExtra2Price=price;
	}

	@Override
	public double itemizeHamburger() {
		double hamburgerPrice=super.itemizeHamburger();
		if(this.healthyExtra1Name!=null) {
			hamburgerPrice +=this.healthyExtra1Price;
			System.out.println("Added "+this.healthyExtra1Name+" for an extra "+this.healthyExtra1Price);
		}
		if(this.healthyExtra2Name!=null) {
			hamburgerPrice +=this.healthyExtra2Price;
			System.out.println("Added "+this.healthyExtra2Name+" for an extra "+this.healthyExtra2Price);
		}
		return hamburgerPrice;
	}
	
	
	
}


package BillysBurgers;

public class DeluxBurger extends Hamburger{

	public DeluxBurger() {
		super("Delux", "Sausage", 20.32, "White");
		super.addHamburgerAddition1("French Fries",14.44);
		super.addHamburgerAddition2("dips", 2.23);
		// TODO Auto-generated constructor stub
	}
	//overriding so that objects of Delux burger cannot add extra items.
	@Override
	public void addHamburgerAddition1(String name, double price) {
		// TODO Auto-generated method stub
		System.out.println("cannot add extras in delux handburgers");
	}

	@Override
	public void addHamburgerAddition2(String name, double price) {
		// TODO Auto-generated method stub
		System.out.println("cannot add extras in delux handburgers");
	}

	@Override
	public void addHamburgerAddition3(String name, double price) {
		// TODO Auto-generated method stub
		System.out.println("cannot add extras in delux handburgers");
	}

	@Override
	public void addHamburgerAddition4(String name, double price) {
		// TODO Auto-generated method stub
		System.out.println("cannot add extras in delux handburgers");
	}
	
	
}


package BillysBurgers;

public class Main {

	public static void main(String[] args) {
		
		Hamburger hamburger = new Hamburger("test","chicken",78.6,"brown");
		
		double price=hamburger.itemizeHamburger();
		hamburger.addHamburgerAddition1("test1",53.3);
		hamburger.addHamburgerAddition2("tomato", 3.45);
		hamburger.addHamburgerAddition3("lettuce", 6.76);
		// TODO Auto-generated method stub
		System.out.println("Total HamBurger price is "+ hamburger.itemizeHamburger());
		
		HealtyBurger hburger=new HealtyBurger("Bacon",6.34);
		hburger.addHealthAddition1("cucumber", 2.1);
		hburger.addHealthyAddition2("tomato", 1.23);
		System.out.println("Total Healthy Burger price is "+ hburger.itemizeHamburger());
		
		DeluxBurger db =new DeluxBurger();
		System.out.println("Total Delux Burger price is "+ db.itemizeHamburger());
		db.addHamburgerAddition1("nachos", 3);
	}
	

}

