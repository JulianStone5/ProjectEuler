public class prob028 {
	
	public static void main(String[] args) {
		int dimension = 1001;
		System.out.println(diagSum(dimension));
	}
	
	public static int diagSum(int dim) {
		int n = (dim-1)/2;
		int diagSum = 16 * n * n * n;
		diagSum += 30 * n * n;
		diagSum += 26 * n;
		diagSum += 3;
		diagSum /= 3;
		return diagSum;
	}
	
}