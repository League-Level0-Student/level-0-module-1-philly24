package extra;
import static javax.swing.JOptionPane.*;
public class Unbirthday {
public static void main(String[] args) {
String answer =showInputDialog("when is you birthday? mm/dd");
 String reply = "06/01";
if (answer.equalsIgnoreCase(reply)) {
	showMessageDialog(null,"happy birth day" );
} else {
showMessageDialog(null, "happy very merry UNbirthday");
}
	

}
}
