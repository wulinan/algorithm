package binaryTreeInorderTraverse94;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import validateBinarySearchTree98.TreeNode;

public class Solution {
public List<Integer> inorderTraversal(TreeNode root) {
	Stack<TreeNode> stack = new Stack<TreeNode>();
	List<Integer> list = new ArrayList<Integer>();
	TreeNode cur = root;
	while(cur!=null||!stack.isEmpty()){
		if(cur!=null){
			stack.push(cur);
			cur = cur.left;
		}else{
			TreeNode node = stack.pop();
			list.add(node.val);
			cur = node.right;
		}
	}
	return list;
        
    }
}
