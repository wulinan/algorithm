package partitionList82;

import removeDuplicateFromList.ListNode;

public class Solution {
	 public ListNode partition(ListNode head, int x) {
		 ListNode small = new ListNode(0);
		 ListNode big = new ListNode(0);
		 ListNode spos = small;
		 ListNode bpos = big;
		 ListNode node = head;
		 while(node!=null){
			 if(node.val<x){
				 spos.next = node;
				 spos = spos.next;
			 }else{
				 bpos.next = node;
				 bpos = bpos.next;
			 }
			 node = node.next;
		 }
		 bpos.next = null;
		 spos.next = big.next;
		 return small.next;
	    }
}
