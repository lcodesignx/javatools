package singletonDesignPattern;

public class ThreadSafeDemo {
	
	private static ThreadSafeDemo instance;
	
	private ThreadSafeDemo() {}
	
	public static ThreadSafeDemo getInstance() {
		if (instance == null) {
			synchronized (ThreadSafeDemo.class) {
				if (instance == null) {
					instance = new ThreadSafeDemo();
				}
			}
		}
		return instance;
	}
}
