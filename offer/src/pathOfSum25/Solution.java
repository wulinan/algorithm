package pathOfSum25;

import java.util.ArrayList;
import java.util.List;

class BinaryTreeNode{
	int val;
	BinaryTreeNode left;
	BinaryTreeNode right;
}

public class Solution {

	public List<List<Integer>> pathOfSum(BinaryTreeNode root,int sum){
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		if(root!=null){
			List<Integer> llist = new ArrayList<Integer>();
			path(list,llist,root,sum);
		}
		return list;
	}
	
	public void path(List<List<Integer>> list,List<Integer> llist,BinaryTreeNode root,int sum){
		if(root.left==null&&root.right==null){
			if(sum-root.val==0){
				llist.add(root.val);
				List<Integer> result = new ArrayList<Integer>();
				for(Integer e:llist){
					result.add(e);
				}
				list.add(result);
			}
			llist.remove(root.val);
			return;
		}
		if(sum-root.val<=0){
			//�������ڵ��ֵ��Ϊ���������и��������ܼ�֦��ֻ�ܵ����Ҷ�ڵ�����жϡ�
			llist.remove(root.val);
			return;	
		}
		llist.add(root.val);
		if(root.left!=null)
			path(list,llist,root.left,sum-root.val);
		if(root.right!=null)
			path(list,llist,root.right,sum-root.val);
		llist.remove(root.val);
	}
}
