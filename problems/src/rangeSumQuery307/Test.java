package rangeSumQuery307;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3};
        NumArray n = new NumArray(nums);
        System.out.println(n.sumRange(0, 2));
        System.out.println(n.nums[1]);
        n.update(1, 3);
        System.out.println(n.nums[1]);
        System.out.println(n.sumRange(0, 2));
	}

}
