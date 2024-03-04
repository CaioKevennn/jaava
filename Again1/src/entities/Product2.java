package entities;

public class Product2 {
	private String name;
	private double price;
	private int quantaty;

	public Product2(String name, double price, int quantaty) {
		this.name = name;
		this.price = price;
		this.quantaty = quantaty;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantaty() {
		return quantaty;
	}

	@Override
	public String toString() {
		return "Product data: " + name + ", $ " + price + "," + quantaty +" units"+", Total: "+this.price*this.quantaty ;
	}
	public String toString(int quantaty) {
		return "Update data: " + name + ", $ " + price + "," + this.quantaty +" units"+", Total: "+this.price*this.quantaty ;
	}


	public double TotalValueInStock() {
		return this.quantaty;
	}

	public void AddProducts(int quantaty) {
		this.quantaty += quantaty;
		System.out.println(toString(quantaty));
		

	}

	public void RemoveProducts(int quantaty) {
		this.quantaty -= quantaty;
		System.out.println(toString(quantaty));
	}
	
}
