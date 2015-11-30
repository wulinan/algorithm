package subset78;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution1 {
	public List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		int[] bit = new int[nums.length];
		Arrays.sort(nums,0,nums.length);
		print_subset(bit,nums,list,0);
		return list;
	}
	
	public void print_subset(int[] bit,int[] nums,List<List<Integer>> list,int cur){
		if(cur==nums.length){
			List<Integer> llist= new ArrayList<Integer>();
			for(int i =0;i<nums.length;i++){
				if(bit[i]==1){
					llist.add(nums[i]);
				}
			}
			list.add(llist);
		}
		else{
			bit[cur]=1;
			print_subset(bit,nums,list,cur+1);
			bit[cur] =0;
			print_subset(bit,nums,list,cur+1);
		}
	}
}
