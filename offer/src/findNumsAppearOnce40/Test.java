package findNumsAppearOnce40;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Solution s = new Solution();
        int[] nums = {2,4,3,6,3,2,5,5};
        int[] result = new int[2];
        result = s.numsAppearOnce(nums);
        System.out.println(result[0]);
        System.out.println(result[1]);
	}
}
