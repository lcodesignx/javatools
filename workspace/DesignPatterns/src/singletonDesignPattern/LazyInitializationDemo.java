package singletonDesignPattern;

public class LazyInitializationDemo {
	
	private static LazyInitializationDemo instance;
	
	private LazyInitializationDemo(){}
	
	public static LazyInitializationDemo getInstance() {
		if (instance == null) {
			instance = new LazyInitializationDemo();
		}
		return instance;
	}
}
