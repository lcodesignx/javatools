package demos;

public class Car implements CarPlan {
	
	private String carMake;
	private String carModel;
	private String carYear;
	private float carPrice;

	@Override
	public void setCarMake(String make) {
		carMake = make;
	}

	@Override
	public void setCarModel(String model) {
		carModel = model;		
	}

	@Override
	public void setCarYear(String year) {
		carYear = year;		
	}

	@Override
	public void setCarPrice(float price) {
		carPrice = price;
	}

	public String getCarMake() {
		return carMake;
	}

	public String getCarModel() {
		return carModel;
	}

	public String getCarYear() {
		return carYear;
	}

	public float getCarPrice() {
		return carPrice;
	}

	@Override
	public String toString() {
		return "Car [carMake=" + carMake + ", carModel=" + carModel + ", carYear=" + carYear + ", carPrice=" + carPrice
				+ "]";
	}

}
