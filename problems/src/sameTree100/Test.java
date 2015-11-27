package sameTree100;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Solution1 s = new Solution1();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(4);
        root.left.left = new TreeNode(3);
        List<String> list = new ArrayList<String>();
        System.out.println(s.binaryTreePaths(root).get(0));
        System.out.println(s.binaryTreePaths(root).get(1));
	}

}
