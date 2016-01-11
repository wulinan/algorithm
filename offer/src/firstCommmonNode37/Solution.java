package firstCommmonNode37;

class ListNode{
	int val;
	ListNode next ;
}
public class Solution {

	public ListNode firstCommonNode(ListNode head1,ListNode head2){
		int length1 = 0,length2 = 0;
		ListNode node1 = head1;
		ListNode node2 = head2;
		while(node1!=null||node2!=null){
			if(node1!=null){
				node1 = node1.next;
				length1++;
			}
				
			if(node2!=null){
				node2 = node2.next;
				length2++;
			}
				
		}
		
		if(length1>length2){
			int dif = length1-length2;
			while(dif>0){
				head1 = head1.next;
			}
		}if(length1<length2){
			int dif = length2-length1;
			while(dif>0){
				head2 = head2.next;
			}
		}
		while(head1!=null&&head2!=null&&head1!=head2){
			head1 = head1.next;
			head2 = head2.next;
		}
		return head1;
	}
}
