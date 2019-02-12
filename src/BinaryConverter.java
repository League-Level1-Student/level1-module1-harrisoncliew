import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.JOptionPane;
public class BinaryConverter implements ActionListener{
	JPanel panel = new JPanel();
	JFrame frame = new JFrame();
	JTextField text = new JTextField(20);
	JButton button = new JButton();
	public static void main(String[] args) {
		BinaryConverter b = new BinaryConverter();
		b.setup();
		
		
	}
	void setup() {
	
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.add((panel));
	frame.pack();
	panel.add(text);
	frame.pack();
	panel.add(button);
	button.setText("Convert");
	button.addActionListener(this);
	frame.pack();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==button) {
			System.out.println(convert(text.getText()));
		}
		
	}
	
	String convert(String input) {
        if(input.length() != 8){
             JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
             return "-";
        }
        String binary = "[0-1]+";    //must contain numbers in the given range
        if (!input.matches(binary)) {
             JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
             return "-";
        }
        try {
             int asciiValue = Integer.parseInt(input, 2);
             char theLetter = (char) asciiValue;
             return "" + theLetter;
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
             return "-";
        }
   }
	

}
