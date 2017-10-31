public class prob034 {
	
	public static void main(String[] args) {
		int[] factorials = new int[10];
		factorials[0] = 1;
		for(int i = 1; i < 10; i++) {
			factorials[i] = i * factorials[i-1];
		}
		
		int sum = 0;
		
		for(int i = 10; i < 2540161; i++) {
			int digits = i;
			int sumFac = 0;
			while(digits > 0) {
				sumFac += factorials[digits%10];
				digits /= 10;
			}
			if(sumFac == i) sum += i;
		}
		
		System.out.println(sum);
	}
	
}