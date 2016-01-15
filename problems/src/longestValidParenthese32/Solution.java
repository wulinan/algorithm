package longestValidParenthese32;

import java.util.Stack;

public class Solution {

	
	public int longestValidParentheses(String s) {
		int max = 0;
		Stack<Integer> stack = new Stack<Integer>();
		for(int i = 0;i<s.length();i++){
			if(s.charAt(i)=='(')
				stack.push(i);
			else{
				if(!stack.isEmpty()&&s.charAt(stack.peek())=='('){
					stack.pop();
					int last = -1;
					if(!stack.isEmpty())
						last = stack.peek();
					int val = i-last;
					max = max>val?max:val;
				}else stack.push(i);
			}
		}
		return max;
	}
}
