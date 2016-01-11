package numbersOf1InN32;

public class Solution {

	public int numbersOf1InN(int n){
		if(n<1) return 0;
		String str = n+"";
		//System.out.println(str);
		return numberOfone(str);
	}
	
	public int numberOfone(String str){
		int length = str.length();
		if(length==1) return 1;
		int first = str.charAt(0)-'0';
		int numbersFirst = 0;
		int numbersOther = 0;
		if(first>1)
			numbersFirst = powerOfTen(length-1);
		else numbersFirst = Integer.valueOf(str.substring(1))+1;
		numbersOther = first * powerOfTen(length-2);
//		System.out.println(numbersFirst);
//		System.out.println(numbersOther);
		int numbersNext = numberOfone(str.substring(1));
		return numbersFirst+numbersOther+numbersNext;
	}
	
	public int powerOfTen(int n){
		int result = 1;
		for(int i =0;i<n;i++){
			result *= 10;
		}
		return result;
	}
}
