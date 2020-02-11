package factoryDesignPattern;

public class TestNoteFactory {

	public static void main(String[] args) {
		// create note object by calling note factory class
		Note plainNote = NoteFactory.createNote("PlainNote");
		Note richNote = NoteFactory.createNote("RichNote");
		Note outlineNote = NoteFactory.createNote("OutlineNote");
		
		// display notes
		System.out.println(plainNote);
		System.out.println(richNote);
		System.out.println(outlineNote);

	}

}
