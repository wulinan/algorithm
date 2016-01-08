package copyComplexList26;

class ComplexListNode{
	int val;
	ComplexListNode next;
	ComplexListNode sibling;
}
public class Solution {

	public void cloneNode(ComplexListNode root){
		ComplexListNode node = root;
		while(node!=null){
			ComplexListNode newNode = new ComplexListNode();
			newNode.val = node.val;
			newNode.next = node.next;
			newNode.sibling = null;
			node.next = newNode;
			node = newNode.next;
		}
	}
	
	public void cloneSibling(ComplexListNode root){
		ComplexListNode node = root;
		while(node!=null){
			ComplexListNode sibling = node.sibling;
			if(sibling!=null)
			   node.next.sibling = sibling.next;
			node = node.next.next;
		}
	}
	
	public ComplexListNode partitionNode(ComplexListNode root){
		ComplexListNode newRoot = root.next;
		ComplexListNode node = root;
		ComplexListNode newNode = newRoot;
	    while(node!=null){
	    	node.next = newNode.next;
	    	node = node.next;
	    	if(node!=null)
	    	  newNode.next = node.next;
	    }
	    return newRoot;
	}
	
	public ComplexListNode copyComplexListNode(ComplexListNode root){
		if(root!=null){
			cloneNode(root);
			cloneSibling(root);
			return partitionNode(root);
		}else return null;
	}
}
