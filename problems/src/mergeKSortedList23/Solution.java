package mergeKSortedList23;


import removeDuplicateFromList.ListNode;

public class Solution {

	public ListNode mergeKLists(ListNode[] lists) {
		if(lists.length==0) return null;
		if(lists.length==1) return lists[0];
		return mergeK(lists,0,lists.length-1);
        
    }
	
	public ListNode mergeK(ListNode[] lists,int i,int j){
		if(i==j) return lists[i];
		int mid = (i+j)/2;
		return merge(mergeK(lists,i,mid),mergeK(lists,mid+1,j));
	}
	
	public ListNode merge(ListNode node1,ListNode node2){
		ListNode newhead = new ListNode(0);
		ListNode cur = newhead;
		while(node1!=null&&node2!=null){
			if(node1.val<node2.val){
				cur.next = node1;
				node1 = node1.next;
			}else{
				cur.next = node2;
				node2 = node2.next;
			}
			cur = cur.next;
		}
		if(node1!=null)
			cur.next = node1;
		if(node2!=null)
			cur.next = node2;
		return newhead.next;
	}
}
