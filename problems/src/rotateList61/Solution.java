package rotateList61;

import removeDuplicateFromList.ListNode;

public class Solution {

	public ListNode rotateRight(ListNode head, int k) {
		ListNode tail = head;
		ListNode node = head; 
		if(head==null) return head;
		int length = 1;
		int count = 0;
		while(tail.next!=null){
			tail = tail.next;
			length++;
		}
		int k2 = k%length;
		if(k2==0) return head;
		for(int i =1;i<length-k2;i++){
			node = node.next;
		}
		ListNode newhead = node.next;
		node.next = null;
		tail.next = head;
		return newhead;
        
    }
}
