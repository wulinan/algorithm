package parenthese;

import java.util.LinkedList;

public class Solution {

	public boolean isValid(String s){
		String left = "({[";
		String right = ")}]";
		LinkedList<Character> stack = new LinkedList<Character>();
		for(char c:s.toCharArray()){
			if(left.indexOf(c)!=-1){
				stack.push(c);
			}else{
				if(stack.isEmpty()||stack.pop()!=left.charAt(right.indexOf(c)))
					return false;
			}
		}
		return stack.isEmpty();
		
	}
}
