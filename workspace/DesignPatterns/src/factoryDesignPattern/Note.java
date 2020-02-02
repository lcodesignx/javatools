package factoryDesignPattern;

public abstract class Note {
	
	public abstract String getTitle();
	
	@Override
	public String toString() {
		return "Title : " + this.getTitle();
	}
}
