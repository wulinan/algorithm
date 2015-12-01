package addTwoNumber2;

import removeDuplicateFromList.ListNode;

public class Solution {

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		if(l1==null && l2==null) return null;
		if (l1==null) return l2;
		else if(l2==null) return l1;
		int val = (l1.val+l2.val)%10;
		ListNode head = new ListNode(val);
		ListNode node = head;
		int count  = 0;
		while(l1.next!=null||l2.next!=null){
			if(l1.next==null) l1.next = new ListNode(0);
			if(l2.next==null) l2.next = new ListNode(0);
			count = (l1.val+l2.val+count)/10;
			val = (l1.next.val+l2.next.val+count)%10;
			node.next = new ListNode(val);
			node = node.next;
			l1 = l1.next;
			l2 = l2.next;
		}
		if((l1.val+l2.val+count)/10==1) node.next = new ListNode(1);
		return head;
    }
}
