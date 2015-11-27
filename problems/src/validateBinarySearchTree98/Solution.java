package validateBinarySearchTree98;

public class Solution {

public boolean isValidBST(TreeNode root) {

	TreeNode pre = null;
	return valid(root,pre);
        
    }

   public boolean valid(TreeNode node,TreeNode pre){
	   if(node == null) return true;
	   if(!valid(node.left,pre)) return false;
	   if(pre!=null&&pre.val>=node.val) return false;
	   
	   System.out.println(node.val);
	   pre = node;
	   System.out.println("pre:"+pre.val);
	   return valid(node.right,pre);
   }
}
