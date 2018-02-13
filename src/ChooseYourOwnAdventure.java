import javax.swing.JOptionPane;

public class ChooseYourOwnAdventure {
	public static void main(String[] args) {
		Object[] names = {"God",
                "Joe",
                "Steve"};
		int name = JOptionPane.showOptionDialog(null,
				"Once upon a time, there was a guy named " + "_______", "Story Mode Part 1", 
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, names, names[2]);
		
		Object[] storyUno = {"God",
                "Joe",
                "Steve"};
		int storyOne = JOptionPane.showOptionDialog(null,
				name + " one day came across a cave, and decided whether or not to enter it", "Story Mode Part 2", 
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, storyUno, storyUno[2]);
		
		
	}
}
