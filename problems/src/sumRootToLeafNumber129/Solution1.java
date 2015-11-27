package sumRootToLeafNumber129;

import validateBinarySearchTree98.TreeNode;

public class Solution1 {
	public int sumNumbers(TreeNode root) {
		if(root==null) return 0;
		return dfs(root,0);
	}
	
	public int dfs(TreeNode root,int num){
		if(root.left==null&&root.right==null){
			return num*10+root.val;
		}
		int sum = 0;
		if(root.left!=null)
			sum+=dfs(root.left,num*10+root.val);
		if(root.right!=null)
			sum+=dfs(root.right,num*10+root.val);
		return sum;
	}
}
