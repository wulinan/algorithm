package insertionSort141;

import removeDuplicateFromList.ListNode;

public class Solution {
  
	public ListNode insertionSortList(ListNode head) {
		ListNode newhead = new ListNode(0);
		newhead.next = null;
		while(head!=null){
			ListNode pos = head;
			head = head.next;
			ListNode node = newhead;
			while(node.next!=null&&node.next.val<pos.val){
				node = node.next;
			}
			ListNode temp = node.next;
			node.next=pos;
			pos.next = temp;
		}
		return newhead.next;
        
    }
}
