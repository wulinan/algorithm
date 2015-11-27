package lca235;

import sameTree100.TreeNode;

public class Solution {

	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		
		if(root==null) return null;
		if((dfs(root.left,p)&&dfs(root.right,q))||(dfs(root.right,p)&&dfs(root.left,q))) return root;
		if((root==p&&(dfs(root.right,q)||dfs(root.left,q)))||((dfs(root.left,p)||dfs(root.right,p))&&root==q)) return root;
		TreeNode node = lowestCommonAncestor(root.left,p,q);
		return node==null?lowestCommonAncestor(root.right,p,q):node;
    }
	public boolean dfs(TreeNode root,TreeNode p){
		if(root==null) return false;
		if(root==p) return true;
		return dfs(root.left,p) || dfs(root.right,p);
	}
}
