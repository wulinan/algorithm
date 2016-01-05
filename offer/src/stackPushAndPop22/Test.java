package stackPushAndPop22;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] pushOrder  = {1,2,3,4,5};
        int[] popOrder = {4,3,5,1,2};
        Solution s = new Solution();
        System.out.println(s.isPopOrder(pushOrder, popOrder));
	}

}
