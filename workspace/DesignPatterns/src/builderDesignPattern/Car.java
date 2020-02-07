package builderDesignPattern;

public class Car {
	
	private String make;
	private String model;
	private String year;
	private float price;
	
	public Car(String make, String model, String year, float price) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [make=" + make + ", model=" + model + ", year=" + year + ", price=" + price + "]";
	}
	
}
