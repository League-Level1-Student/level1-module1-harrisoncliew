
public class Vault {

	public static void main(String[] args) {
		Vault v = new Vault();
		boolean b = v.tryCode(8869385);
		System.out.println(b);
		
	}
	
	int secretCode = 8869385;
	boolean tryCode(int guess){
		if(guess==secretCode) {
			return true;
		}
		else {
			return false;
		}
		
	}

}

