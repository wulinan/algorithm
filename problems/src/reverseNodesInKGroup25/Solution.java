package reverseNodesInKGroup25;

import removeDuplicateFromList.ListNode;

public class Solution {

	public ListNode reverseKGroup(ListNode head, int k) {
		ListNode cur = head;
		int count = k;
		ListNode pre = cur;
		while(count>0&&cur!=null){
			pre = cur;
			cur = cur.next;
			count--;
		}
		if(count>0&&cur==null) return head;
		ListNode node = reverseKGroup(cur,k);
		reverse(head,k);
        head.next = node;
        return pre;
    }
	
	public void reverse(ListNode head,int k){
			ListNode newhead = new ListNode(0);
			newhead.next = null;
			ListNode node = head;
			while(k>0&&node!=null){
				ListNode pre = node;
				node = node.next;
				ListNode temp = newhead.next;
				newhead.next = pre;
				pre.next = temp;
				k--;
			}
	}
}
