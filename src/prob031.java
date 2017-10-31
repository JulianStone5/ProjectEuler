public class prob031 {
	
	public static void main(String[] args) {
		int[] coins = {1, 2, 5, 10, 20, 50, 100, 200};
		System.out.println(numWays(200,coins.length-1,coins));
	}
	
	public static int numWays(int target, int maxCoin, int[] coins) {
		if(target == 0) return 1;
		if(target < 0) return 0;
		if(maxCoin < 0 && target > 0) return 0;
		return numWays(target, maxCoin-1, coins) + numWays(target-coins[maxCoin], maxCoin, coins);
	}
	
}