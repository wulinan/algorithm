package combination28;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

	public List<List<Integer>> combination(int[] nums){
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		int[] bit = new int[nums.length];
		Arrays.fill(bit, 0);
		for(int i =1;i<=nums.length;i++){
			combinate(list,bit,nums,0,i);
		}
		return list;
	}
	
	public void combinate(List<List<Integer>> list,int[] bit,int[] nums,int cur,int m){
		if(m>nums.length-cur)
			return;
		if(m==0){
			List<Integer> llist = new ArrayList<Integer>();
			for(int i =0;i<bit.length;i++){
				if(bit[i]==1)
					llist.add(nums[i]);
			}
			list.add(llist);
			return;
		}
		bit[cur]=1;
		combinate(list,bit,nums,cur+1,m-1);
		bit[cur] =0;
		combinate(list,bit,nums,cur+1,m);
		
	}
}
