package stackPushAndPop22;

import java.util.Stack;

public class Solution {

	public boolean isPopOrder(int[] pushOrder,int[] popOrder){
		boolean result=false;
		if(pushOrder.length==popOrder.length&&pushOrder.length>0&&popOrder.length>0){
			int length=pushOrder.length;
			int i=0,j=0;
			Stack<Integer> stack= new Stack<Integer>();
			while(j<length){
				while(stack.isEmpty()||stack.peek()!=popOrder[j]){
					if(i==length)
						break;
					stack.push(pushOrder[i++]);
				}
				if(stack.peek()!=popOrder[j])
					break;
				stack.pop();
				j++;
			}
			if(j==length&&stack.isEmpty())
				result = true;
		}
		return result;
	}
}
