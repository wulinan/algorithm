package findNumsAppearOnce40;

public class Solution {

	public int[] numsAppearOnce(int[] nums){
		if(nums.length==0) return null;
		int[] result = {0,0};
		int n = 0;
		for(int i =0;i<nums.length;i++){
			n ^=nums[i];
		}
		int resultOXR = (n^(n-1))&n;
		for(int i =0;i<nums.length;i++){
			if((nums[i]&resultOXR)!=0)
				result[0]^=nums[i];
			else result[1]^=nums[i];
		}
		return result;
	}
}
