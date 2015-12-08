package mutiplyStrings43;

public class Solution {

	public String multiply(String num1, String num2) {
		int length1 = num1.length();
		int length2 = num2.length();
		int[] product = new int[length1+length2];
		for(int i = length1-1;i>=0;i--){
			for(int j = length2-1;j>=0;j--){
				int value1 = num1.charAt(i)-'0';
				int value2 = num2.charAt(j)-'0';
				product[i+j+1] += value1*value2;
			}
		}
		int carry = 0;
		for(int k=product.length-1;k>=0;k--){
			int a = (product[k]+carry)%10;
			carry = (product[k]+carry)/10;
			product[k] = a;
		}
		StringBuilder sb = new StringBuilder();
		for(int i = 0;i<product.length;i++) sb.append(product[i]);
		while(sb.length()!=1&&sb.charAt(0)=='0') sb.deleteCharAt(0);
	    return sb.length()==0?"0":sb.toString();
        
    }
}
