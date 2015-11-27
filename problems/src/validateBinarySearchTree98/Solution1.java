package validateBinarySearchTree98;

public class Solution1 {
	 public boolean isValidBST(TreeNode root) {
	        return valid(root,Long.MIN_VALUE,Long.MAX_VALUE);
	    }
	 
	 //定义long型是防止最小的节点或者最大的节点是int型的最小或最大值。定义long型最大最小可以保证任何节点都是介于他们之间的。
	 public boolean valid(TreeNode root,long minVal,long maxVal){
		 if(root==null)  return true;
		 if(root.val>=maxVal||root.val<=minVal) return false;
		 return valid(root.left,minVal,root.val)&&valid(root.right,root.val,maxVal);
	 }
}
