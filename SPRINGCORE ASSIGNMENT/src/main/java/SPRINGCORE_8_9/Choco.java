package SPRINGCORE_8_9;

public class Choco {

	private double price;

	@Override
	public String toString() {
		return "Choco [price=" + price + "]";
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Setting the price..");
		this.price = price;
	}

	public Choco(double price) {
		super();
		this.price = price;
	}

	public Choco() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public void init()
	{
		System.out.println("Inside init method");
	}
	
	public void destroy()
	{
		System.out.println("Inside destroy method");
	}
}
