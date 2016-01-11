package uglyNumber34;

public class Solution {

	public int uglyNumber(int n){
		int[] nums = new int[n];
		nums[0] = 1;
		int nextIndex = 1;
		int factor2 = 0,factor3=0,factor5=0;
		while(nextIndex<n){
			int min = Math.min(nums[factor2]*2, Math.min(nums[factor3]*3, nums[factor5]*5));
			nums[nextIndex] = min;
			while(nums[factor2]*2<=min)
				factor2++;
			while(nums[factor3]*3<=min)
				factor3++;
			while(nums[factor5]*5<=min)
				factor5++;
			nextIndex++;
		}
		return nums[nextIndex-1];
	}
}
