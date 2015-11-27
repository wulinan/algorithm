package removeDuplicateFromList;

public class Solution {

  public ListNode deleteDuplicates(ListNode head) {
	  if (head!=null && head.next!=null){
	  ListNode p = head;
	  ListNode q = head.next;
	  while(q!=null){
		  if(p.val!=q.val){
			  if(p.next!=q)
			     p.next=q;
			  p=q;
			  System.out.println("p.val:"+p.val);
		  }
		  System.out.println("q.val:"+q.val);
		  q=q.next;
	  }
	     p.next=null;
	  }
	  return head;
    }
}
