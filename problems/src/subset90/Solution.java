package subset90;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

	public List<List<Integer>> subsetsWithDup(int[] nums) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		list.add(new ArrayList<Integer>());
		Arrays.sort(nums, 0, nums.length);
		for(int i = 0;i<nums.length;){
			int count = 0;
			while(count+i<nums.length&&nums[i]==nums[count+i]) count++;
			int length = list.size();
			for(int k = 0;k<length;k++){
				List<Integer> llist = list.get(k);
				List<Integer> temp = new ArrayList<Integer>(llist.size());
				copy(llist,temp);
				for(int j = 0;j<count;j++){
					
					temp.add(nums[i]);
					List<Integer> t = new ArrayList<Integer>(temp.size());
					copy(temp,t);
					list.add(t);
					
				}
			}
		}
		return list;
    }
	
	public void copy(List<Integer> list1,List<Integer> list2){
		for(int i = 0;i<list1.size();i++){
			list2.add(list1.get(i));
		}
	}
}
