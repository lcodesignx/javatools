package singletonDesignPattern;

public class EagerInitializationDemo {
	
	private static final EagerInitializationDemo instance = new EagerInitializationDemo();
	
	// private constructor to avoid client application to use constructor
	private EagerInitializationDemo() {}
	
	public static EagerInitializationDemo getInstance() {
		return instance;
	}
}
