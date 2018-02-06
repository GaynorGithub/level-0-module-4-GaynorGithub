//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
		String change = JOptionPane.showInputDialog("How many nickels do you got?");
		// Convert their answer to an int using Integer.parseInt()
		double nickels = Integer.parseInt(change) * .01 * 5;
		// Ask the user how many dimes they have, and convert their answer
		String moreChange = JOptionPane.showInputDialog("How many dimes do you got?");
		double dimes = Integer.parseInt(moreChange) * .01 * 10;
		// Ask the user how many quarters they have, and convert their answer
		String evenMoreChange = JOptionPane.showInputDialog("How many quarters do you got?");
		double quarters = Integer.parseInt(evenMoreChange) * .01 * 25;
		// Calculate how much money the user has and save it in a double variable 
		double money = nickels + dimes + quarters;
		// Tell the user how much money they have
		JOptionPane.showMessageDialog(null, "You have " + money + " dollars");
	}
}

