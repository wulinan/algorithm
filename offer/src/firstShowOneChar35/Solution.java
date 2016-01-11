package firstShowOneChar35;

import java.util.HashMap;
import java.util.Set;

public class Solution {

	public Character firstShow(String s){
		if(s.length()==0) return null;
		Character result = null; 
		HashMap<Character,Integer> map = new HashMap<Character, Integer>();
		for(int i=0;i<s.length();i++){
			if(map.containsKey(s.charAt(i)))
				map.remove(s.charAt(i));
			else{
				map.put(s.charAt(i), i);
			}
		}
		if(!map.isEmpty()){
			Set<Character> set = map.keySet();
			int index = Integer.MAX_VALUE;
			for(char c:set){
				if(index>map.get(c)){
					index = map.get(c);
					result = c; 
				}
			}
		}
		return result;
	}
}
