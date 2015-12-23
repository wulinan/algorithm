package reverseWordInString151;

import java.util.LinkedList;

public class Solution {

	public String reverseWords(String s) {
		String result = "";
		String[] str = s.split("\\s+");
		LinkedList stack = new LinkedList();
		for(String ss:str){
			stack.push(ss);
		}
		while(!stack.isEmpty()){
			result+=stack.pop()+" ";
		}
		result = result.trim();
		return result;
        
    }
}
