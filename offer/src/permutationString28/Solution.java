package permutationString28;

import java.util.ArrayList;
import java.util.List;

public class Solution {

	public List<String> permutation(String str){
		List<String> list = new ArrayList<String>();
		if(str!=null){
			char[] array = str.toCharArray();
			permutation(list,array,0);
		}
		return list;
	}
	
	public void permutation(List<String> list,char[] array,int begin){
		if(begin==array.length){
			StringBuilder s = new StringBuilder();
			for(char c:array)
				s.append(c);
			list.add(s.toString());
			return;
		}
		for(int i =begin;i<array.length;i++){
			if(i!=begin&&array[i]==array[begin])
				continue;
			char temp = array[i];
			array[i] = array[begin];
			array[begin] = temp;
			
			permutation(list,array,begin+1);
			
		    temp = array[i];
			array[i] = array[begin];
			array[begin] = temp;
		}
	}
}
