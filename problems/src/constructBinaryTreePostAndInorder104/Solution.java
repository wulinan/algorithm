package constructBinaryTreePostAndInorder104;

import validateBinarySearchTree98.TreeNode;

public class Solution {

	public TreeNode buildTree(int[] inorder, int[] postorder) {
		if(inorder==null&&postorder==null) return null;
		return dfs(inorder,postorder,postorder.length-1,0,inorder.length);
    }
	
	public TreeNode dfs(int[] inorder,int[] postorder,int post,int begin,int end){
		if(begin==end) return null;
		int i = end-1;
		for(;i>=begin;i--){
			if(postorder[post]==inorder[i])
				break;
		}
		TreeNode node = new TreeNode(postorder[post]);
		node.left = dfs(inorder,postorder,post-(end-i),begin,i);
		node.right = dfs(inorder,postorder,post-1,i+1,end);
		return node;
	}
}
