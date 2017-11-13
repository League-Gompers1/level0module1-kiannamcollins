package variables_and_conditionals;

import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

    // 1. Make a main method that includes all the steps below….
public static void main(String[] args) {
	int ran = new Random().nextInt(4);

    // 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"

    // 3. Print out this variable
System.out.println(ran);
    // 4. Get the user to enter a question for the 8 ball
JOptionPane.showInputDialog("Ask a Question");

    // 6. If the random number is 1
if (ran == 1 ) { 
	JOptionPane.showMessageDialog(null, "No");
	
}
    // -- tell the user "No"

    // 7. If the random number is 2
else if (ran == 2) {
	JOptionPane.showMessageDialog(null, "Maybe you should ask google?");
}
    // -- tell the user "Maybe you should ask Google?"

    // 8. If the random number is 3
else if (ran == 3 ) {
	JOptionPane.showMessageDialog(null, "sure?");
}
    // -- write your own answer
else {
	JOptionPane.showMessageDialog(null, "Yes");
}
}
}