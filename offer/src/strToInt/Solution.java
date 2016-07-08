package strToInt;

public class Solution {

	public int StrToInt(String str){
		int length = str.length();
		char first = str.charAt(0);
		boolean minus = false;
		int i = 0;
		if(first=='-')
			minus = true;
		long result = 0;
		for(;i<length;i++){
			if(i==0 && (str.charAt(i)=='+'||str.charAt(i)=='-'))
				continue;
			if(str.charAt(i)>='0'&&str.charAt(i)<='9'){
				result = result*10+str.charAt(i)-'0';
				if((!minus && result>Integer.MAX_VALUE) || (minus && result<Integer.MIN_VALUE))
					return 0;
			}else
				return 0;
		}
		return minus?(int)(-result):(int)result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Solution s = new Solution();
        String str = "-123";
        String str1= "+234i6";
        String str2 = "2348";
        System.out.println(s.StrToInt(str));
        System.out.println(s.StrToInt(str1));
        System.out.println(s.StrToInt(str2));
	}

}
