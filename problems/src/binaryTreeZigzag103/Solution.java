package binaryTreeZigzag103;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import validateBinarySearchTree98.TreeNode;

public class Solution {
 public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
	 List<List<Integer>> list = new ArrayList<List<Integer>>();
	 if(root==null) return list;
	 LinkedList<TreeNode> cur = new LinkedList<TreeNode>();
	 LinkedList<TreeNode> next = new LinkedList<TreeNode>();
	 cur.add(root);
	 boolean tag = true;
	 while(true){
		 List<Integer> llist = new ArrayList<Integer>();
		 if(tag){
			 while(!cur.isEmpty()){
				 TreeNode node = cur.removeFirst();
				 llist.add(node.val);
				 if(node.left!=null)
					 next.add(node.left);
				 if(node.right!=null)
					 next.add(node.right);
			 }
			 tag = false;
		 }else{
			 while(!cur.isEmpty()){
				 TreeNode node = cur.removeFirst();
				 llist.add(0,node.val);
				 if(node.left!=null)
					 next.add(node.left);
				 if(node.right!=null)
					 next.add(node.right);
			 }
			 tag = true;
		 }
		 list.add(llist);
		 if(next.isEmpty()) return list;
		 LinkedList<TreeNode> temp = cur;
		 cur = next;
		 next = temp;
	 }
    }
}
