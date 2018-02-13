import javax.swing.JOptionPane;

public class TestScores {
	public static void main(String[] args) {
		String score = JOptionPane.showInputDialog("What is your grade percentage score?");
		int grade = Integer.parseInt(score);
		if(grade >= 90) {
			JOptionPane.showMessageDialog(null, "Thats an A! Excellent Grade!");
		}
		else if(grade >= 80) {
			JOptionPane.showMessageDialog(null, "Thats a B! Better than a C but worse than an A.");
		}
		else if(grade >= 70) {
			JOptionPane.showMessageDialog(null, "Thats a C. You are mediocre");
		}
		else if(grade >= 60) {
			JOptionPane.showMessageDialog(null, "Thats a D. Better stay away from that F");
		}
		else {
			JOptionPane.showMessageDialog(null, "Thats an F! GET 2 WORK BOI!");
		}
	}
}
