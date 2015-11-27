package sameTree100;

import java.util.ArrayList;
import java.util.List;

public class Solution1 {

public List<String> binaryTreePaths(TreeNode root) {
	List<String> list = new ArrayList<String>();
	return dfs(root,list,"");
    }

//public List<String> dfs(TreeNode root , List<String> list ,String s){
//	s+=root.val;
//	if(root.left==null&&root.right==null){
//		list.add(s);
//		return list;
//	}
//	if(root.left!=null){
//	    dfs(root.left,list,s+"->");	
//	}
//	if(root.right!=null){
//		dfs(root.right,list,s+"->");
//	}
//	return list;
//}

public List<String> dfs(TreeNode root , List<String> list ,String s){
	if(root==null) return list;
	s+=root.val;
	if(root.left==null&&root.right==null){
		list.add(s);
		return list;
	}
    dfs(root.left,list,s+"->");	
    dfs(root.right,list,s+"->");
	return list;
}
}
