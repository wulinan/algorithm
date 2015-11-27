package sumRootToLeafNumber129;

import validateBinarySearchTree98.TreeNode;

public class Solution {

	public int sumNumbers(TreeNode root) {
		return dfs(root,0,0);
    }
	
	public int dfs(TreeNode root,int sum,int num){ 
		if(root==null) return sum;
		num = num*10+root.val;
		if(root.left==null&&root.right==null){
			sum+=num;
			//System.out.println("root.val:"+root.val+"    sum:"+sum);
			return sum;
		}
		sum = dfs(root.left,sum,num);
		//System.out.println("root.val:"+root.val+"    sum:"+sum);
		return dfs(root.right,sum,num);
	}
}
