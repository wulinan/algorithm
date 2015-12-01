package longestSubset3;

import java.util.HashMap;

public class Solution1 {
	public int lengthOfLongestSubstring(String s) {
		if(s.length()==0) return 0;
		int max = 1;
		int j =0;
		HashMap<Character, Integer> map = new HashMap<Character,Integer>();
		map.put(s.charAt(0), 0);
		for(int i = 1;i<s.length();i++){
			if(map.containsKey(s.charAt(i))&&map.get(s.charAt(i))>=j){
				j = map.get(s.charAt(i))+1;
			}
			map.put(s.charAt(i),i);
			max = max>(i-j+1)?max:(i-j+1);
		}
		return max;
	}
}
