package singleNumber136;

public class Solution {

	public int singleNumber(int[] nums) {
		int length = nums.length;
		int result = 0;
		for(int i = 0;i<length;i++){
			result ^= nums[i];
		}
		return result;
        
    }
}
