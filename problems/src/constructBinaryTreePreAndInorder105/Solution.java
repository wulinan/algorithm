package constructBinaryTreePreAndInorder105;

import validateBinarySearchTree98.TreeNode;

public class Solution {


	public TreeNode buildTree(int[] preorder, int[] inorder) {
		if(preorder==null&&inorder==null) return null;
		return dfs(preorder,inorder,0,0,preorder.length);
        
    }
	
	public TreeNode dfs(int[] preorder,int[] inorder,int pre,int begin,int end){
		if(begin==end) return null;
		int i = begin;
		int count = 0;
		for(;i<end;i++){
			if(preorder[pre]==inorder[i]){
				break;
			}
			count++;
		}
		TreeNode node = new TreeNode(preorder[pre]);
		node.left = dfs(preorder,inorder,pre+1,begin,i);
		node.right = dfs(preorder,inorder,pre+count+1,i+1,end);
		return node; 
	}
}
