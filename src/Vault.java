import java.util.Random;

import javax.swing.JOptionPane;

public class Vault {

	public static void main(String[] args) {
		Vault v = new Vault();
		JamesBond jb = new JamesBond();
		int code = jb.findCode(v);
		System.out.println(code);
		
	}
	
	int secretCode = new Random().nextInt(1000001);
	boolean tryCode(int guess){
		if(guess==secretCode) {
			return true;
		}
		else {
			return false;		}
		
	}
	

}

