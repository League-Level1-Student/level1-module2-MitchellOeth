import javax.swing.JOptionPane;

public class PopcornMaker {
public static void main(String[] args) {
	String Goood = JOptionPane.showInputDialog("What flavor of popcorn do you want?");
	String time = JOptionPane.showInputDialog("How many minutes do you want your popcorn to heat?");
	Popcorn Good = new Popcorn(Goood);
	Microwave Cool = new Microwave();
	int tiime = Integer.parseInt(time);
Cool.putInMicrowave(Good);	
Cool.setTime(tiime);
Cool.startMicrowave();
}
}