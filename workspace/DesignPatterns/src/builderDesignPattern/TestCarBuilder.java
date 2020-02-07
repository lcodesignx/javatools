package builderDesignPattern;

public class TestCarBuilder {

	public static void main(String[] args) {
		
		Car car = new CarBuilder().setMake("VW").setModel("Jetta").getCar();
		
		System.out.println(car);

	}

}
