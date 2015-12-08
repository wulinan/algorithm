package divideTwoInteger29;

public class Solution {

	public int divide(int dividend, int divisor) {
		if(divisor==0) return Integer.MAX_VALUE;
		int flag;
		if(dividend<0&&divisor<0||dividend>0&&divisor>0) flag = 1;
		else flag = 0;
		long ldividend =Math.abs((long)dividend);
		long ldivisor = Math.abs((long)divisor);
		long result = ldivide(ldividend,ldivisor);
		if(result>Integer.MAX_VALUE){
			return flag==1?Integer.MAX_VALUE:Integer.MIN_VALUE;
		}
		return flag==1?(int)result:(int)-result;
    }
	
	public long ldivide(long dividend,long divisor){
		if(dividend<divisor) return 0;
		long sum = divisor;
		long mutiply = 1;
		while(sum+sum<=dividend){
			sum+=sum;
			mutiply+=mutiply;
		}
		return mutiply+ldivide(dividend-sum,divisor);
	}
}
