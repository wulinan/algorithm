package twoSum1;

import java.util.HashMap;

public class Solution1 {

	public int[] twoSum(int[] nums, int target) {
		int[] result = {0,0};
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i =0;i<nums.length;i++){
			int diff = target-nums[i];
			if(map.containsKey(diff)){
				result[0] = map.get(diff)+1;
				result[1] = i+1;
				return result;
			}
			if(!map.containsKey(nums[i]))
			    map.put(nums[i], i);
		}
		return result;
	}
}
