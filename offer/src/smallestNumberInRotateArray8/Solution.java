package smallestNumberInRotateArray8;

public class Solution {

	public int smallestNumber(int[] nums){
		if(nums.length==0) return 0;
		if(nums.length==1) return nums[0];
		if(nums.length==2) return nums[0]<=nums[1]?nums[0]:nums[1];
		int pos1 = 0;
		int pos2 = nums.length-1;
		if(nums[pos1]<nums[pos2])
			return nums[pos1];
		int mid = (pos1+pos2)/2;
		if(nums[pos1]==nums[mid]&&nums[mid]==nums[pos2]){
			int min = nums[0];
			for(int i=0;i<nums.length;i++){
				if(nums[i]<min)
					min = nums[i];
			}
			return min;
		}
		while(pos2-pos1>1){
			mid = (pos1+pos2)/2;
			if(nums[pos1]<nums[mid])
				pos1 = mid;
			else pos2 = mid;
		}
		return nums[pos2];
	}
}
