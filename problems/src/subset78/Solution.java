package subset78;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

	public List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		int[] temp = new int[nums.length];
		Arrays.sort(nums, 0, nums.length);
		print_subset(nums,temp,list,0,0);
		return list;        
    }
	
	public void print_subset(int[] nums,int[] temp,List<List<Integer>> list,int cur,int begin){
		List<Integer> llist = new ArrayList<Integer>();
		for(int i = 0;i<cur;i++){
			llist.add(temp[i]);
		}
		list.add(llist);
		for(int i = begin;i<nums.length;i++){                                       
			temp[cur] = nums[i];
			print_subset(nums,temp,list,cur+1,i+1);
		}
	}
}
