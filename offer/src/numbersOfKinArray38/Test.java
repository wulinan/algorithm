package numbersOfKinArray38;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Solution s = new Solution();
        int[] nums = {};
        int[] nums1 = {1,2,3,3,3,3,4,5};
        int[] nums2 = {1};
        System.out.println(s.getK(nums, 2));
        System.out.println(s.getK(nums1, 3));
        System.out.println(s.getK(nums2, 1));
        System.out.println(s.getK(nums1, 0));
	}

}
