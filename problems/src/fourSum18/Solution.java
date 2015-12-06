package fourSum18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Solution {

	public List<List<Integer>> fourSum(int[] nums, int target) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		if(nums.length<4) return list;
		Arrays.sort(nums);
		HashMap<Integer, List<Integer>> map = new HashMap<Integer,List<Integer>>();
		for(int i =0;i<nums.length-1;i++){
			for(int j = i+1;j<nums.length;j++){
				if(!map.containsKey(nums[i]+nums[j])){
					List<Integer> pair = new ArrayList<Integer>(2);
					map.put(nums[i]+nums[j], pair);
				}
				List<Integer> pos = map.get(nums[i]+nums[j]);
				pos.add(i);
				pos.add(j);
			}
		}
		
		for(int i =0;i<nums.length-3;i++){
			if(i==0||nums[i]!=nums[i-1]){
				for(int j = i+1;j<nums.length-2;j++){
					int diff = target-nums[i]-nums[j];
					if(map.containsKey(diff)){
						List<Integer> pair = map.get(diff);
						for(int k=0;k<pair.size()-1;k=k+2){
							if(pair.get(k)>j){
								List<Integer> llist = new ArrayList<Integer>();
								llist.add(nums[i]);
								llist.add(nums[j]);
								llist.add(nums[pair.get(k)]);
								llist.add(nums[pair.get(k+1)]);
								if(list.contains(llist)) continue;
								list.add(llist);
							}
						}
						
					}
				}
			}
		}
		return list;
    }
}
