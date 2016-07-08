package constructTreePostAndInorder6;

class TreeNode {
	 int val;
	 TreeNode left;
	 TreeNode right;
	 TreeNode(int x) { val = x; }
	 }
public class Solution {


	public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        if(pre.length==0||in.length==0||pre.length!=in.length)
            return null;
        return construct(pre,in,0,in.length-1,0);
    }
    
    public TreeNode construct(int[] pre,int[] in,int inStart,int inEnd,int preorder){
    	int i = inStart;
        for(;i<=inEnd;i++){
            if(pre[preorder]==in[i])
                break;
        }
        int length = i-inStart;
        TreeNode root = new TreeNode(pre[preorder]);
        root.left = null;
        root.right = null;
        if(i-1>=inStart)
            root.left = construct(pre,in,inStart,i-1,preorder+1);
        if(i+1<=inEnd)
            root.right = construct(pre,in,i+1,inEnd,preorder+length+1);
        return root;
    }
}
