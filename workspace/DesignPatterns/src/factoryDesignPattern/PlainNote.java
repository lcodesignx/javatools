package factoryDesignPattern;

public class PlainNote extends Note {
	
	private String title;
	
	public PlainNote(String title) {
		this.title = title;
	}
	
	@Override
	public String getTitle() {
		return this.title;
	}
}
