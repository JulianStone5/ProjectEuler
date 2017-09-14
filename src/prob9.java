public class prob9 {
	
	public static void main(String[] args) {
		int a, b, c;
		for(int i = 1; i <= 333; i++) {
			boolean found = false;
			for(int j = i; j < 500; j++) {
				a = i;
				b = j;
				c = 1000 - a - b;
				if(a*a + b*b == c*c) {
					found = true;
					System.out.println((a*b*c));
					break;
				}
			}
			if(found) break;
		}
	}
	
}