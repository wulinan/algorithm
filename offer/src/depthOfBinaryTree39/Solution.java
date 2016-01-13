package depthOfBinaryTree39;

class TreeNode{
	int val;
	TreeNode left,right;
}
public class Solution {

	public int treeDepth(TreeNode root){
		if(root==null)
			return 0;
		int left = treeDepth(root.left);
		int right = treeDepth(root.right);
		return left>right?left+1:right+1;
	}
	
	public boolean isBalanceTree(TreeNode root){
		return isBalance(root)>=0;
	}
	
	private int isBalance(TreeNode root){
		if(root==null)
			return 0;
		int left = isBalance(root.left);
		int right = 0;
		if(left!=-1)
			 right = isBalance(root.right);
		if(left<0||right<0||Math.abs(left-right)>1)
			return -1;
		return Math.max(left, right)+1;
	}
}
