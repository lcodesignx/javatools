package singletonDesignPattern;

public class StaticBlockDemo {
	
	private static StaticBlockDemo instance;
	
	private StaticBlockDemo() {}
	
	// static block initialization for exception handling
	static {
		try {
			instance = new StaticBlockDemo();
		} catch (Exception ex) {
			throw new RuntimeException("Exception occurred in creating singleton instance");
		}
	}
	
	public static StaticBlockDemo getInstance() {
		return instance;
	}
}
