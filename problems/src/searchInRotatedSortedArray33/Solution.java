package searchInRotatedSortedArray33;

public class Solution {

	public int search(int[] nums, int target) {
		int pos1 = 0,pos2=nums.length-1;
		if(nums[pos1]<nums[pos2])
			return binary(nums,target,0,nums.length);
		while(pos2-pos1>1){
			int mid = (pos1+pos2)/2;
			if(nums[pos1]<nums[mid])
				pos1 = mid;
			else
				pos2 = mid;
		}
		if(target>=nums[pos2]&&target<=nums[nums.length-1])
			return binary(nums,target,pos2,nums.length-1);
		if(target<=nums[pos1]&&target>=nums[0])
			return binary(nums,target,0,pos1);
		return -1;
    }
	
	public int binary(int[] nums,int target,int start,int end){
		if(start>end)
			return -1;
		int mid = (start+end)/2;
		if(target<nums[mid])
			return binary(nums,target,start,mid-1);
		else if(target>nums[mid])
			return binary(nums,target,mid+1,end);
		else return mid;
	}
}
