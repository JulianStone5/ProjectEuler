import java.util.ArrayList;

public class prob21 {
	
	public static ArrayList<Integer> amicable = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		for(int i = 1; i < 10000; i++) {
			if(i == d(d(i)) && i != d(i)) {
				if(!amicable.contains(i)) amicable.add(i);
				if(!amicable.contains(d(i))) amicable.add(d(i));
			}
		}
		int sum = 0;
		for(int i = 0; i < amicable.size(); i++) {
			sum += amicable.get(i);
		}
		System.out.println(sum);
	}
	
	public static int d(int n) {
		int sum = 0;
		for(int i = 1; i <= Math.sqrt(n); i++) {
			if(n % i == 0) sum += i + n/i;
			if(i == Math.sqrt(n)) sum -= i;
		}
		sum -= n;
		return sum;
	}
}