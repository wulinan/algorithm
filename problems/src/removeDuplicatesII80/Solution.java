package removeDuplicatesII80;

public class Solution {

	public int removeDuplicates(int[] nums) {
		if(nums.length<3) return nums.length;
		int pos1 = 0;
		int pos2 = 0;
		int count = 0;
		while(pos2<nums.length){
			count = 1;
			while(pos2+1<nums.length&&nums[pos2]==nums[pos2+1]){
				count++;
				pos2++;
			}
			nums[pos1]=nums[pos2];
			if(count>=2)
			   nums[++pos1] = nums[pos2];
			pos1++;
			pos2++;
		}
		return pos1;
    }
}
