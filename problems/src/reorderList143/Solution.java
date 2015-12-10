package reorderList143;

import removeDuplicateFromList.ListNode;

public class Solution {

	public void reorderList(ListNode head) {
		ListNode node = head;
		if(node==null) return;
        while(node.next!=null&&node.next.next!=null){
        	ListNode temp = node;
        	ListNode tail = node;
        	ListNode pre = null;
        	node = node.next;
        	while(tail.next!=null){
        		pre = tail;
        		tail = tail.next;
        	}
        	temp.next = tail;
        	tail.next = node;
        	pre.next = null;
        }
    }
}
