package binaryTreeInorderTraverse94;

import java.util.ArrayList;
import java.util.List;

import validateBinarySearchTree98.TreeNode;

public class Solution1 {

	public List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> list = new ArrayList<Integer>();
		dfs(root,list);
		return list;
		
	}
	
	public void dfs(TreeNode root,List<Integer> list){
		if(root==null)  return;
		dfs(root.left,list);
		list.add(root.val);
		dfs(root.right,list);
	}
}
