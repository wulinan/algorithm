package reorderList143;

import removeDuplicateFromList.ListNode;

public class Solution1 {
	public void reorderList(ListNode head) {
		if(head==null) return;
		ListNode slow = head;
		ListNode fast = head;
		//找中点
		while(fast.next!=null&&fast!=null){
			slow = slow.next;
			fast = fast.next.next;
		}
		ListNode fake = new ListNode(0);
		ListNode node = slow.next;
		slow.next = null;
		//反转中点之后的链表
		while(node!=null){
			ListNode tempf = fake.next;
			ListNode tempn = node;
			node = node.next;
			fake.next = tempn;
			tempn.next = tempf;
		}
		//合并链表；
		node = head;
		fake = fake.next;
		while(fake!=null){
			ListNode temp = node;
			node = node.next;
			temp.next = fake;
			ListNode newhead = fake;
			fake = fake.next;
			newhead.next = node;
		}
	}
}
