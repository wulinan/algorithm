package validateBinarySearchTree98;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Solution1 s = new Solution1();
        TreeNode root = new TreeNode(22);
        root.left = new TreeNode(20);
        root.left.left = new TreeNode(10);
        root.left.right = new TreeNode(23);
        System.out.println(s.isValidBST(root));
	}

}
