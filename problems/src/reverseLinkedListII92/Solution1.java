package reverseLinkedListII92;

import removeDuplicateFromList.ListNode;

public class Solution1 {
	public ListNode reverseBetween(ListNode head, int m, int n) {
		if(m==n) return head;
		ListNode newhead = new ListNode(0);
		newhead.next = head;
		ListNode node = newhead;
		ListNode pos1=node,pos2=node;
		int count =0;
		while(node.next!=null){
			if(count==m-1) pos1 = node;
			if(count==n){
				pos2 = node;
				break;
			}
			count++;
			node = node.next;
		}
		ListNode node1 = pos1.next;
		ListNode node2 = pos2.next;
		ListNode nhead = pos1.next;
		while(nhead!=node2){
			ListNode pos = nhead;
			nhead = nhead.next;
			ListNode temp = pos1.next;
			pos1.next = pos;
			pos.next = temp;
		}
		node1.next = node2;
		return newhead.next;
		
	}
}
