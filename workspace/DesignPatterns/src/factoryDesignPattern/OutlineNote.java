package factoryDesignPattern;

public class OutlineNote extends Note {

	private String title;
	
	public OutlineNote(String title) {
		this.title = title;
	}
	
	@Override
	public String getTitle() {
		return this.title;
	}
}
