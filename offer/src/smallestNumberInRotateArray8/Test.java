package smallestNumberInRotateArray8;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Solution s = new Solution();
        int[] nums = {3,4,5,1,2};
        System.out.println(s.smallestNumber(nums));
        int[] nums1 = {1,0,1,1,1};
        System.out.println(s.smallestNumber(nums1));
        int[] nums2 = {1,1,1,0,1};
        System.out.println(s.smallestNumber(nums2));
        int[] nums3 = {1,1,2,1,1};
        System.out.println(s.smallestNumber(nums3));
	}

}
