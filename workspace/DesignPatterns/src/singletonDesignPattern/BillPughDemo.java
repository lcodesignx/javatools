package singletonDesignPattern;

public class BillPughDemo {
	
	private BillPughDemo(){}
	
	private static class SingletonHelper {
		private static final BillPughDemo INSTANCE = new BillPughDemo();
	}
	
	public static BillPughDemo getInstance() {
		return SingletonHelper.INSTANCE;
	}
}
