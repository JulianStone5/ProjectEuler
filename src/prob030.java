public class prob030 {
	
	public static void main(String[] args) {
		int[] powers = new int[10];
		for(int i = 0; i < 10; i++) {
			powers[i] = (int) Math.pow(i,5);
		}
		
		int sum = 0;
		
		for(int i = 2; i < 355000; i++) {
			int digits = i;
			int sumPow = 0;
			while(digits > 0) {
				sumPow += powers[digits%10];
				digits /= 10;
			}
			if(sumPow == i) sum += i;
		}
		
		System.out.println(sum);
	}
	
}