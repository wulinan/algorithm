package mergeTwoSortedList17;

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class Solution {
	public ListNode Merge(ListNode list1,ListNode list2) {
        ListNode node1 = list1;
        ListNode node2 = list2;
        ListNode head = node1.val<=node2.val?node1:node2;
        while(node1!=null&&node2!=null){
           if(node1.val>node2.val){
               ListNode node = node1;
               node1 = node2;
               node2 = node;
           } 
            System.out.println("node1:"+node1.val);
            System.out.println("node2:"+node2.val);
           if(node1.next.val>node2.val){
               ListNode temp = node1;
               node1 = node1.next;
               temp.next = node2;
            }else
               node1 = node1.next;
        }
        return head;
    }
}
