
public class JamesBond {
	int findCode(Vault v) {
		for (int i = 0; i < 1000001 ; i++) {
			boolean b = v.tryCode(i);
			if(b==true) {
				return i;
			}
			
		}
		
		
		return -1;
	}
}
