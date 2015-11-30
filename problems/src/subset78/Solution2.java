package subset78;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution2 {
	public List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		Arrays.sort(nums, 0, nums.length);
		for(int i =0;i<(1<<nums.length);i++){
			print_subset(list,nums,i);
		}
		return list;
	}
	
	public void print_subset(List<List<Integer>> list,int[] nums,int s){
		List<Integer> llist = new ArrayList<Integer>();
		for(int i = 0;i<nums.length;i++){
			if((s&(1<<i))!=0){
				llist.add(nums[i]);
			}
		}
		list.add(llist);
	}
}
