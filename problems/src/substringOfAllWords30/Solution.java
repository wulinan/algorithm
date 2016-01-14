package substringOfAllWords30;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {

	public List<Integer> findSubstring(String s, String[] words) {
		int slength = s.length();
		int wlength = words.length;
		int clength = words[0].length();
		List<Integer> list = new ArrayList<Integer>();
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        
        for(String str:words){
        	if(map.containsKey(str)){
        		int value = map.get(str)+1;
        		map.put(str, value);
        	}
        	else map.put(str, 1);
        }
        for(int i=0;i<=slength-wlength*clength;i++){
        	int k=0;
        	int pos  = i;
        	System.out.println("i:"+i+"k:"+k);
        	HashMap<String,Integer> cmap = new HashMap<String,Integer>(map);
        	for(;k<wlength;k++){
        		System.out.println("k:"+k);
        		System.out.println("pos:"+pos);
        		String ss = "";
        		if(pos+clength<=slength)
        		    ss = s.substring(pos, pos+clength);
        		else break;
            	pos+=clength;
            	if(cmap.containsKey(ss)){
            		if(cmap.get(ss)==1)
            			cmap.remove(ss);
            		else
            			cmap.put(ss, cmap.get(ss)-1);
            	}
            	else break;
        	}
        	if(k==wlength)
        		list.add(i);
        }
        return list;
    }
}
