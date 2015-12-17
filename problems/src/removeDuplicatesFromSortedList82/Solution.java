package removeDuplicatesFromSortedList82;

import removeDuplicateFromList.ListNode;

public class Solution {

	public ListNode deleteDuplicates(ListNode head) {
		ListNode newhead = new ListNode(Integer.MIN_VALUE);
		newhead.next = head;
		duplication(newhead,head);
		return newhead.next;
        
    }
	
	public void duplication(ListNode head,ListNode node){
		if(node==null){
			head.next=null;
			return;
		}
		int count = 1;
		while(node.next!=null&&node.val==node.next.val){
			node = node.next;
			count++;
		}
		if(count==1){
			head.next = node;
			head = head.next;
			duplication(head,head.next);
		}else duplication(head,node.next);
	}
}
