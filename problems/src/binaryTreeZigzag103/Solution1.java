package binaryTreeZigzag103;

import java.util.ArrayList;
import java.util.List;

import validateBinarySearchTree98.TreeNode;

public class Solution1 {
	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		dfs(list,root,0);
		return list;
	}
	
	public void dfs(List<List<Integer>> list,TreeNode root,int level){
		if(root ==null) return;
		if(level>=list.size()){
			List<Integer> llist = new ArrayList<Integer>();
			list.add(llist);
		}
		if(level%2==0) 
		   list.get(level).add(root.val);
		else list.get(level).add(0, root.val);
		
		dfs(list,root.left,level+1);
		dfs(list,root.right,level+1);
	}
}
