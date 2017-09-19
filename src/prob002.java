public class prob002 {
	
	public static void main(String[] args) {
		int sum = 0;
		int a = 1;
		int b = 1;
		while(b < 4000000) {
			int temp = b;
			b += a;
			a = temp;
			if(b % 2 == 0) sum += b;
		}
		System.out.println(sum);
	}
	
}