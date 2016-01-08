package copyListWithRandomPointer138;

class RandomListNode {
	 int label;
	 RandomListNode next, random;
	 RandomListNode(int x) { this.label = x; }
};
	 
public class Solution {

	public RandomListNode copyRandomList(RandomListNode head) {
		if(head!=null){
		cloneNodes(head);
		cloneRandom(head);
	    return partitionNodes(head);
		}else return null;
        
    }
	
	public void cloneNodes(RandomListNode head){
		RandomListNode node = head;
		while(node!=null){
			RandomListNode temp = new RandomListNode(node.label);
			temp.next = node.next;
			temp.random = null;
			node.next = temp;
			node = temp.next;
		}
	}
	
	public void cloneRandom(RandomListNode head){
		RandomListNode node = head;
		while(node!=null){
			RandomListNode random = node.random;
			if(random!=null)
				node.next.random = random.next;
			node = node.next.next;
		}
	}
	
	public RandomListNode partitionNodes(RandomListNode head){
		RandomListNode node = head;
		RandomListNode newhead = head.next;
		RandomListNode newnode = newhead;
		while(node!=null){
		    RandomListNode temp = newnode.next;
			node.next = temp;
			node = node.next;
			if(node!=null){
			    newnode.next = node.next; 
			}
			newnode = newnode.next;
		}
		return newhead;
	}
}
