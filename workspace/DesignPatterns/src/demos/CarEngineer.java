package demos;

public class CarEngineer {
	
	private CarBuilder carBuilder;
	
	public CarEngineer(CarBuilder carBuilder) {
		this.carBuilder = carBuilder;
	}
	
	public Car getCar() {
		return this.carBuilder.getCar();
	}
	
	public void makeCar() {
		this.carBuilder.buildCarMake();
		this.carBuilder.buildCarModel();
		this.carBuilder.buildCarYear();
		this.carBuilder.buildCarPrice();
	}
}
