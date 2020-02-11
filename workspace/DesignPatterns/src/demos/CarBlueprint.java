package demos;

public class CarBlueprint implements CarBuilder {

	private Car car;
	
	public CarBlueprint() {
		this.car = new Car();
	}
	
	@Override
	public void buildCarMake() {
		car.setCarMake("VW");		
	}

	@Override
	public void buildCarModel() {
		car.setCarModel("Jetta");		
	}

	@Override
	public void buildCarYear() {
		car.setCarYear("2015");		
	}

	@Override
	public void buildCarPrice() {
		car.setCarPrice(25999.99f);		
	}

	@Override
	public Car getCar() {
		return this.car;
	}

}
