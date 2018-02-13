//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;


public class SleepyHead {


    public static void main(String[] args) {
        
        boolean isWeekday, isVacation;
        
        int isItWeekday = JOptionPane.showConfirmDialog(null, "Is it a weekday?", "Input Yes or No",
        		JOptionPane.YES_NO_OPTION);
        int isItVacation = JOptionPane.showConfirmDialog(null, "Is it a vacation?", "Input Yes or No",
        		JOptionPane.YES_NO_OPTION);
        
        if (isItWeekday == JOptionPane.YES_OPTION) {
        		isWeekday = true;
        }
        else {
        		isWeekday = false;
        }
        
        if (isItVacation == JOptionPane.YES_OPTION) {
    			isVacation = true;
        }
        else {
    			isVacation = false;
        }
        
        /*
         * Ask the user for these values using
         * JOptionPane.showConfirmDialog(null, "is it a weekday?", "",
         * JOptionPane.YES_NO_OPTION);
         */
        
        if (isWeekday == true && isVacation == false) {
        		JOptionPane.showMessageDialog(null, "get up lazybones!");
        }
        else if (isWeekday == false && isVacation == false) {
    			JOptionPane.showMessageDialog(null, "sleep in.");
        }
        else if (isWeekday == true && isVacation == true) {
        		JOptionPane.showMessageDialog(null, "sleep in.");
        }
        else if (isVacation == true && isWeekday == false) {
        		JOptionPane.showMessageDialog(null, "sleep in.");
        }
        else {
        		JOptionPane.showMessageDialog(null, "Please try again");
        }


        /*
         * Print “sleep in” if it is a vacation or a weekend. If it’s a weekday,
         * print “get up lazybones!” If it is a weekday, and we are on vacation,
         * print “sleep in”.
         */
    }
}
