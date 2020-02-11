package factoryDesignPattern;

public class NoteFactory {
	
	public static Note createNote(String title) {
		
		if ("PlainNote".equalsIgnoreCase(title)) {
			return new PlainNote(title);
		} else if ("RichNote".equalsIgnoreCase(title)) {
			return new RichNote(title);
		} else if ("OutlineNote".equalsIgnoreCase(title)) {
			return new OutlineNote(title);
		}
		
		return null;
	}
}
