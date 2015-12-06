package threeSum15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution1 {
	public List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		if(nums.length<3) return list;
		Arrays.sort(nums);
		for(int i = 0;i<nums.length-2;i++){
			if(i==0||nums[i]!=nums[i-1]){
				int j = i+1;
				int k = nums.length-1;
				while(j<k){
					if(j>i+1&&nums[j]==nums[j-1]){
						j++;
						continue;
					}
					if(k+1<nums.length&&nums[k]==nums[k+1]){
						k--;
						continue;
					}
					if(nums[i]+nums[j]+nums[k]>0) k--;
					else if(nums[i]+nums[j]+nums[k]<0) j++;
					else{
						List<Integer> llist = new ArrayList<Integer>();
						llist.add(nums[i]);
						llist.add(nums[j]);
						llist.add(nums[k]);
						list.add(llist);
						j++;k--;
					}
			}
			}
		}
		return list;
	}
}
