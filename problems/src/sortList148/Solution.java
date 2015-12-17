package sortList148;

import removeDuplicateFromList.ListNode;

public class Solution {

	public ListNode sortList(ListNode head) {
		if(head==null||head.next==null) return head;
        ListNode slow = head;
		ListNode fast = head.next.next;
		while(fast!=null&&fast.next!=null){
			fast = fast.next.next;
			slow = slow.next;
		}
		ListNode newhead = sortList(slow.next);
		slow.next=null;
		return merge(sortList(head),newhead);
    }
	
	public ListNode merge(ListNode h1,ListNode h2){
		ListNode newhead = new ListNode(Integer.MIN_VALUE);
		ListNode node = newhead;
		while(h1!=null&&h2!=null){
			if(h1.val<h2.val){
				node.next=h1;
				h1=h1.next;
			}else{
				node.next = h2;
				h2 = h2.next;
			}
			node = node.next;
		}
		if(h1!=null)
			node.next = h1;
		if(h2!=null)
			node.next = h2;
		return newhead.next;
	}
}
