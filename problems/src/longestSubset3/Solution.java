package longestSubset3;

public class Solution {

	public int lengthOfLongestSubstring(String s) {
		int max = 1;
		int j = 0;
		for(int i = 1;i<s.length();i++){
			int begin = j;
			for(;j<i;j++){
				if(s.charAt(i)==s.charAt(j)){
					break;
				}
			}
			j = j<i? j+1:begin;
			max = max>(i-j+1)?max:(i-j+1);
		}
		return s.length()==0?0:max;
        
    }
}
