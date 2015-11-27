package sumRootToLeafNumber129;

import validateBinarySearchTree98.TreeNode;

public class Solution2 {
	public int sumNumbers(TreeNode root) {
		return dfs(root,0);
	}
	public int dfs(TreeNode root,int num){
		if(root==null) return 0;
		if(root.left==null&&root.right==null) return num*10+root.val;
		return dfs(root.left,num*10+root.val) + dfs(root.right,num*10+root.val);
	}
}
