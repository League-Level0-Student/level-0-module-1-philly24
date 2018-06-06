import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.JOptionPane;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0



public class TheRiddler {
	;
	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int score= 0;
 
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
 String answer=showInputDialog("What can travel around the world while staying in a corner?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
String reply = "stamp"; 
 if (answer.equalsIgnoreCase(reply)){
	showMessageDialog(null, "correct");
	score+= 1;
	showMessageDialog(null, "your score:" + score);
} else {
	showMessageDialog(null, "wrong. the correct answer was a stamp");
}
		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
	String answer2= showInputDialog("what has a head and tail, but no body"); 
String reply2 = "coin";
	if (answer2.equalsIgnoreCase(reply2)) {
		showMessageDialog(null, "correct");
		score+= 1;
		showMessageDialog(null, "your final score:" + score);
	} else {
showMessageDialog(null, "wrong. the correct answer is a coin");

	}

	}
}

