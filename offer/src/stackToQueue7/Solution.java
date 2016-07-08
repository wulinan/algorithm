package stackToQueue7;

import java.util.Stack;

public class Solution {
	Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    
    public void push(int node) {
        stack1.push(node);
    }
    
    public int pop() {
    
        if(stack2.empty()){
            while(!stack1.empty()){
                int temp = stack1.pop();
                stack2.push(temp);
            }
        }
        if(stack2.empty())
			try {
				throw new Exception("queue is empty");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        return stack2.pop();
    }
}
