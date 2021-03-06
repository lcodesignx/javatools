package templateDesignPattern;

public abstract class HouseTemplate {
	
	// Template method, final so subclasses cannot override
	public final void buildHouse() {
		buildFoundation();
		buildPillars();
		buildWalls();
		buildWindows();
		System.out.println("House is built");
	}
	
	// Default implementation
	private void buildWindows() {
		System.out.println("Building Glass Windows");
	}
	
	// Methods to be implemented by subclasses
	public abstract void buildWalls();
	public abstract void buildPillars();
	
	private void buildFoundation() {
		System.out.println("Building foundation with cement, iron rods and sand");
	}
}
