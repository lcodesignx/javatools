package factoryDesignPattern;

public class RichNote extends Note {
	
	private String title;
	
	public RichNote(String title) {
		this.title = title;
	}
	
	@Override
	public String getTitle() {
		return this.title;
	}
}
