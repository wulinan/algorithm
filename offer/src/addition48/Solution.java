package addition48;

public class Solution {

	public int addition(int num1,int num2){
		int sum=0,carry=0;
		do{
			sum = num1^num2;
			carry = (num1&num2)<<1;
			
			num1 = sum;
			num2 = carry;
		}while(num2!=0);
		return sum;
	}
}
