import javax.swing.JOptionPane;

public class ChooseYourOwnAdventure {
	public static void main(String[] args) {
		
		int storyOne = JOptionPane.showConfirmDialog(null,
				"One day Joe came across an ice cream shop. Do you want Joe to enter the ice cream shop?", "Story Mode Part 1", 
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null);
		
		System.out.println(storyOne);
		
		if (storyOne == 0) {
			int storyTwo = JOptionPane.showConfirmDialog(null,
				"After entering the shop, Joe had to choose between Chocolate or Vanilla. Press Yes for Chocolate, and press No for Vanilla", "Story Mode Part 2", 
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null);
			if (storyTwo == 0) {
				JOptionPane.showMessageDialog(null, "Joe was very very happy with his chocolate ice cream");
			}
			else if (storyTwo == 1) {
				JOptionPane.showMessageDialog(null, "Joe was very very happy with his vanilla ice cream");
			}
		}
		else if (storyOne == 1) {
			JOptionPane.showMessageDialog(null, "After leaving the shop behind, Joe was sad because he did not get ice cream. You are the cause of Joe's sadness for not letting him visit the ice cream shop.");
			
		}
		JOptionPane.showMessageDialog(null, "The End.");
	}
}
