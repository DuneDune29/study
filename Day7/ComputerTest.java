package Day7;

public class ComputerTest {

	public static void main(String[] args) {
		// Computer c1 = new Computer();
		Computer c2 = new DeskTop();
		c2.display();
		// Computer c3 = new NoteBook();
		Computer c4 = new MyNoteBook();
		c4.typing();

	}
}