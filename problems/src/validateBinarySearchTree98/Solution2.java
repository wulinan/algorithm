package validateBinarySearchTree98;

import java.util.Stack;

public class Solution2 {

	public boolean isValidBST(TreeNode root) {
		Stack<TreeNode> stack = new Stack<TreeNode>();
		TreeNode cur = root;
		TreeNode pre = null;
		while(!stack.isEmpty()||cur!=null){
			if(cur!=null){
				stack.push(cur);
				cur = cur.left;
			}else{
				TreeNode p = stack.pop();
				if(pre!=null&&pre.val>=p.val) return false;
				pre = p;
				cur = p.right;
			}
		}
		return true;
	}
}
