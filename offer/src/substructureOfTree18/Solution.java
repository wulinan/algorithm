package substructureOfTree18;

class BinaryTreeNode{
	int val;
	BinaryTreeNode left;
	BinaryTreeNode right;
}
public class Solution {

	public boolean hasSubtree(BinaryTreeNode root1,BinaryTreeNode root2){
		boolean result = false;
		if(root1!=null&&root2!=null){
		if(root1.val==root2.val)
			result = doesTree1HasTree2(root1,root2);
		if(!result)
			hasSubtree(root1.left,root2);
		if(!result)
			hasSubtree(root1.right,root2);
		}else if(root2==null)
			return true;
		return result;
	}
	
	public boolean doesTree1HasTree2(BinaryTreeNode root1,BinaryTreeNode root2){
		if(root2==null)
			return true;
		if(root1==null)
			return false;
		if(root1.val!=root2.val)
			return false;
		return doesTree1HasTree2(root1.left,root2.left)&&doesTree1HasTree2(root1.right,root2.right);
	}
}
