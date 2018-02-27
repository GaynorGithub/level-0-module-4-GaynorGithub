//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0





import javax.swing.JOptionPane;

public class HappyPet {
	static 
	
	int happinessLevel = 0;
	static String petName = "a";
	public static void main(String[] args) {
		
		int pet = JOptionPane.showOptionDialog(null, "What pet do you want to buy?", "Choose Your Pet!", 0, JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Dog", "Cat" }, null);
		System.out.println(pet);
		if (pet == 1) {
			petName = "cat";
		}
		else if(pet == 0) {
			petName = "dog";
		}
		for (int i = 0; i < 6; i++) {
			
			int task = JOptionPane.showOptionDialog(null, "What do you want to do to your " + petName + "?", "Can Your Pet!", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Pet", "Brush", "Feed" }, null);
			
			if (task == 0) {
				pet();
			}
			else if (task == 1) {
				brush();
			}
			else if (task == 2) {
				feed();
			}
			
			if (happinessLevel == 4) {
				JOptionPane.showMessageDialog(null, "You love your pet!");
				break;
			}
			
		}
	}

	public static void pet() {
		if (petName.equals("cat")) {
			JOptionPane.showMessageDialog(null, "The cat purrs!");
		}
		else if (petName.equals("dog")) {
			JOptionPane.showMessageDialog(null, "The dog loves it!");
		}
		happinessLevel = happinessLevel + 1;
	}
	public static void brush() {
		if (petName.equals("cat")) {
			JOptionPane.showMessageDialog(null, "The cat purrs a lot!");
		}
		else if (petName.equals("dog")) {
			JOptionPane.showMessageDialog(null, "The dog enjoys it!");
		}
		happinessLevel = happinessLevel + 1;
	}
	public static void feed() {
		if (petName.equals("cat")) {
			JOptionPane.showMessageDialog(null, "The cat gobbles it down!");
		}
		else if (petName.equals("dog")) {
			JOptionPane.showMessageDialog(null, "The dog eats it all!");
		}
		happinessLevel = happinessLevel + 1;
	}
}