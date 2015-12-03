package threeSum15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Solution {

	public List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> list = new LinkedList<List<Integer>>();
		Arrays.sort(nums);
		for(int i = 0;i<nums.length;i++){
			if(i==0||nums[i]!=nums[i-1]){
				int target = 0-nums[i];
				list = twoSum(list,nums,target,i+1,nums.length,nums[i]);
			}
		}
		return list;
    }
	
	public List<List<Integer>> twoSum(List<List<Integer>> list,int[] nums,int target,int begin,int end,int val){
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		int i = begin;
		for(;i<end;i++){
			int diff = target-nums[i];
			if(map.containsKey(diff)){
				int j = map.get(diff);
				List<Integer> llist = new LinkedList<Integer>();
				llist.add(val);
				llist.add(nums[j]);
				llist.add(nums[i]);
				list.add(llist);
			}
			map.put(nums[i], i);
		}
		return list;
	}
}
