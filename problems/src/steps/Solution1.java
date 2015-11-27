package steps;

public class Solution1 {
	public int climbStairs(int n) {
		int x = 0;
		int y = 1;
		int z = 0;
		for(int i = 1;i<=n;i++){
			z = x+y;
			x=y;
			y=z;
		}
			return z;
		
	}
}
