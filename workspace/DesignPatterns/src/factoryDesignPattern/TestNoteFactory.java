package factoryDesignPattern;

public class TestNoteFactory {

	public static void main(String[] args) {
		// create note object by calling note factory class
		Note plainNote = NoteFactory.getTitle("PlainNote");
		Note richNote = NoteFactory.getTitle("RichNote");
		Note outlineNote = NoteFactory.getTitle("OutlineNote");
		
		// display notes
		System.out.println(plainNote);
		System.out.println(richNote);
		System.out.println(outlineNote);

	}

}
