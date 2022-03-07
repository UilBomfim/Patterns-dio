package model;

public abstract class Product implements ProductIF {

	protected String name = "";
	protected String code = "";
	protected double price = 0.00;
	
	public Product() {
		
	}
	
	public Product(String name, String code, Double price) {
		this.name = name;
		this.code = code;
		this.price = price;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public String getCode() {
		return code;
	}

	public double getPrice() {
		return this.price;
	}

	@Override
	public String toString() {
		return "Product [name=" + getName() + ", code=" + getCode() + ", price=" + getPrice() + "]";
	}			
}
