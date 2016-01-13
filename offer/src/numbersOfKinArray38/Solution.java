package numbersOfKinArray38;

public class Solution {

	private int getFirst(int[] nums,int k,int start,int end){
		if(start>end)
			return -1;
		int mid = (start+end)>>1;
		if(nums[mid]==k){
			if(mid==0||(mid>0&&nums[mid-1]!=k))
				return mid;
			else end = mid-1;
		}
		else if(nums[mid]<k)
			start = mid+1;
		else end = mid-1;
		return getFirst(nums,k,start,end);
	}
	
	private int getLast(int[] nums,int k,int start,int end){
		if(start>end)
			return -1;
		int mid = (start+end)>>1;
		if(nums[mid]==k){
			if(mid==nums.length-1||(mid<nums.length-1&&nums[mid+1]!=k))
				return mid;
			else start = mid+1;
		}
		else if(nums[mid]<k)
			start = mid+1;
		else end = mid-1;
		return getLast(nums,k,start,end);
	}
	
	public int getK(int[] nums,int k){
		int first = getFirst(nums,k,0,nums.length-1);
		int last = getLast(nums,k,0,nums.length-1);
		int result = 0;
		if(first!=-1&&last!=-1)
			result = last-first+1;
		return result;
	}
}
