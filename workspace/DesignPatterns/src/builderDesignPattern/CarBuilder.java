package builderDesignPattern;

public class CarBuilder {

	private String make;
	private String model;
	private String year;
	private float price;
	
	public CarBuilder setMake(String make) {
		this.make = make;
		return this;
	}
	public CarBuilder setModel(String model) {
		this.model = model;
		return this;
	}
	public CarBuilder setYear(String year) {
		this.year = year;
		return this;
	}
	public CarBuilder setPrice(float price) {
		this.price = price;
		return this;
	}
	
	public Car getCar() {
		return new Car(make, model, year, price);
	}
	
}
