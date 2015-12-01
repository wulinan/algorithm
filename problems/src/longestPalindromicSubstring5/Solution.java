package longestPalindromicSubstring5;

public class Solution {

	public String longestPalindrome(String s) {
		StringBuilder sb2 = new StringBuilder();
		int max = 0;
		int x=0,y=0;
		for(int i = 0;i<s.length();i++){
			for(int j =0;i-j>=0&&i+j<s.length();j++){
				if(s.charAt(i-j)!=s.charAt(i+j)) break;
				if(j*2+1>max){
					max = j*2+1;
				    x = i-j;
				    y = i+j;
			}
		}
			for(int k = 0;i-k>=0&&i+1+k<s.length();k++){
				if(s.charAt(i-k)!=s.charAt(i+1+k)) break;
				if(k*2+2>max){
					max = k*2+2;
				    x = i-k;
				    y = i+k+1;
			}
		}
			
		}
		for(int i = x;i<=y;i++){
			sb2.append(s.charAt(i));
		}
		return sb2.toString();
    }
}
