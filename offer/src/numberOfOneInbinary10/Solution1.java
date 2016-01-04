package numberOfOneInbinary10;

public class Solution1 {

	public int numberOfOne(int n){
		int count = 0;
		while(n!=0){
			count++;
			n=n&(n-1);
		}
		return count;
	}
}
