package demos;

public class TestCarBuilder {

	public static void main(String[] args) {
		
		CarBuilder bluePrint = new CarBlueprint();
		
		CarEngineer carEngineer = new CarEngineer(bluePrint);
		
		carEngineer.makeCar();
		
		Car firstCar = carEngineer.getCar();
		System.out.println(firstCar);
	}

}
