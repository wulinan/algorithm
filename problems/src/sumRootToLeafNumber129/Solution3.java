package sumRootToLeafNumber129;

import java.util.Stack;

import validateBinarySearchTree98.TreeNode;

public class Solution3 {
	public int sumNumbers(TreeNode root) {
		Stack<TreeNode> stack = new Stack<TreeNode>();
		Stack<Integer> s = new Stack<Integer>();
		s.push(0);
		TreeNode cur = root;
		TreeNode pre = null;
		int sum = 0;
		int num = 0;
		while(!stack.isEmpty()||cur!=null){
			if(cur!=null){
				stack.push(cur);
				num= s.peek()*10 + cur.val;
				//System.out.println("cur:"+cur.val+"   num:"+num);
				s.push(num);
				cur = cur.left;
			}else{
				TreeNode node = stack.peek();
				if(node.right!=null&&node.right!=pre){
					cur = node.right;
				}else{
					stack.pop();
					if(node.left==null&&node.right==null){
					    sum+=s.pop();
					    //System.out.println("sum:"+sum);
					}
					else s.pop();
					pre = node;
				}
			}
		}
		return sum;
	}
}
