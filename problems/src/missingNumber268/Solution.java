package missingNumber268;

public class Solution {

	public int missingNumber(int[] nums) {
		int result = nums.length;
		int i =0;
		for(int num:nums){
			result ^= num;
			result ^= i;
			i++;
		}
		return result;
    }
}
