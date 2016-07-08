package mergeTwoSortedList17;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Solution s = new Solution();
		ListNode list1 = new ListNode(1);
		list1.next = new ListNode(3);
		list1.next.next = new ListNode(5);
		ListNode list2 = new ListNode(2);
		list2.next = new ListNode(4);
		list2.next = new ListNode(6);
		
		System.out.println(s.Merge(list1, list2));
	}

}
