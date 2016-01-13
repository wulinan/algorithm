package sumIsS41;

public class Solution {

	public int[] sumIsS(int[] nums,int s){
		int[] result = new int[2];
		int first = 0,last = nums.length-1;
		while(first<last){
			if(nums[first]+nums[last]==s){
				result[0] = nums[first];
				result[1] = nums[last];
				return result;
			}else if(nums[first]+nums[last]<s)
				first++;
			else last--;
		}
		return result;
	}
}
