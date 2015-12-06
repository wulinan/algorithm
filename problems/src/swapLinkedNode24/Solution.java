package swapLinkedNode24;

import removeDuplicateFromList.ListNode;

public class Solution {

	public ListNode swapPairs(ListNode head) {
		ListNode node = head;
		ListNode pre = null;
		if(head==null||head.next==null) return head;
		head = head.next;
	    while(node!=null&&node.next!=null){
	    	ListNode temp = node.next;
			node.next = node.next.next;
			temp.next = node;
			if(pre!=null) pre.next = temp;
			node = node.next;
			pre = node;
		}
		return head;
        
    }
}
