package lca235;

import java.util.ArrayList;
import java.util.List;

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
	
	public TreeNode lowestCommonAncestor1(TreeNode root, TreeNode p, TreeNode q) {
        List<TreeNode> list1 = new ArrayList<TreeNode>();
        List<TreeNode> list2 = new ArrayList<TreeNode>();
        getNodePath(list1,root,p);
        getNodePath(list2,root,q);
        return getCommonParent(list1,list2);
    }
    
    public boolean getNodePath(List<TreeNode> list,TreeNode root,TreeNode node){
    	if(root==null) return false;
        list.add(root);
        if(root==node) return true;
        boolean found = getNodePath(list,root.left,node) || getNodePath(list,root.right,node);
        if(!found) list.remove(root);
        return found;
        
    }
    
    public TreeNode getCommonParent(List<TreeNode> list1,List<TreeNode> list2){
        int length1 = list1.size();
        int length2 = list2.size();
        TreeNode common = null;
        int i = 0;
        while(i<length1 && i<length2){
            if(list1.get(i)==list2.get(i)){
                common = list1.get(i);
                i++;
            }else break;    
        }
        return common;
    }
}
