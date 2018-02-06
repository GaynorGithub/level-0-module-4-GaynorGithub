import javax.swing.JOptionPane;

public class TestScores {
	public static void main(String[] args) {
		String score = JOptionPane.showInputDialog("What is your percent score?");
		int grade = Integer.parseInt(score);
		if(grade >= 90) {
			JOptionPane.showMessageDialog(null, "Thats an A!");
			break();
		}
		else if(grade >= 89) {
			JOptionPane.showMessageDialog(null, "Thats a B!");
		}
		else if(grade >= 90) {
			JOptionPane.showMessageDialog(null, "Thats a C!");
		}
		else if(grade >= 90) {
			JOptionPane.showMessageDialog(null, "Thats a D!");
		}
		else if(grade >= 90) {
			JOptionPane.showMessageDialog(null, "Thats an F!");
		}
	}
}
