package groupAnagrams49;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Solution {

	public List<List<String>> groupAnagrams(String[] strs) {
		if (strs == null || strs.length == 0) return new ArrayList<List<String>>();
		HashMap<String,List<String>> map = new HashMap<String,List<String>>();
		Arrays.sort(strs, 0, strs.length);
		for(String ss:strs){
			char[] arrays = ss.toCharArray();
			Arrays.sort(arrays);
			String key = String.valueOf(arrays);
			if(!map.containsKey(key))
				map.put(key, new ArrayList<String>());
		    map.get(key).add(ss);
		}
		return new ArrayList<List<String>>(map.values());
    }
}
