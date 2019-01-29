import javax.swing.JOptionPane;
public class PopcornRunner {
	public static void main(String[] args) {
		String flavor = JOptionPane.showInputDialog("What flavor popcorn do you want?");
		Popcorn p = new Popcorn(flavor);
		Microwave m = new Microwave();
		String time = JOptionPane.showInputDialog("How many minutes do you want the popcorn to cook in the microwave?");
		int time2 = Integer.parseInt(time);
		m.setTime(time2);
		m.putInMicrowave(p);
		m.startMicrowave();
		p.applyHeat();
		p.eat();
	}

}
