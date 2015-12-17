package reverseLinkedListII92;

import removeDuplicateFromList.ListNode;

public class Solution {
    //交换任意两个节点
	public ListNode reverseBetween(ListNode head, int m, int n) {
		if(m==n) return head;
		ListNode newhead = new ListNode(0);
		newhead.next = head;
		ListNode node = newhead;
		ListNode pos1=node,pos2=node;
		int count =0;
		if(m-n==1){
			while(node.next!=null){
				if(count==m-1) break;
				count++;
				node = node.next;
			}
			ListNode node1=node.next;
			ListNode node2 = node1.next;
			ListNode node3 = node2.next;
			node.next = node2;
			node2.next = node1;
			node1.next = node3;
		}else{
			while(node.next!=null){
				if(count==m-1) pos1 = node;
				if(count==n-1){
					pos2 = node;
					break;
				}
				count++;
				node = node.next;
			}
			ListNode node11 = pos1.next;
			ListNode node12 = node11.next;
			ListNode node21 = pos2.next;
			ListNode node22 = node21.next;
			pos1.next = node21;
			node21.next = node12;
			pos2.next = node11;
			node11.next = node22;
		}
		return newhead.next;
    }
}
