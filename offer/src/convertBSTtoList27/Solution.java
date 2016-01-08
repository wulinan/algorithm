package convertBSTtoList27;

class BinaryTreeNode{
	int val;
	BinaryTreeNode left,right;
}
public class Solution {

	public BinaryTreeNode convert(BinaryTreeNode root){
		BinaryTreeNode lastNode = null;
		convertNodes(root,lastNode);
		while(lastNode!=null&&lastNode.left!=null){
			lastNode = lastNode.left;
		}
		return lastNode;
	}
	
	public void convertNodes(BinaryTreeNode node,BinaryTreeNode lastNode){
		if(node==null)
			return ;
		if(node.left!=null)
			convertNodes(node.left,lastNode);
		node.left = lastNode;
		if(lastNode!=null)
		    lastNode.right = node;
		lastNode = node;
		if(node.right!=null)
			convertNodes(node.right,lastNode);
	}
}
