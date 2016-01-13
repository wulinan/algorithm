package sumIsS41;

import java.util.ArrayList;
import java.util.List;

public class ContinuousSequence {

	public List<List<Integer>> continuousSequence(int[] nums,int s){
		if(nums.length==0) return null;
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		int first = 0,last=0,sum=0;
		while(first<nums.length&&last<=nums.length&&nums[first]<(s+1)/2){
			if(sum==s){
				List<Integer> llist = new ArrayList<Integer>();
				for(int i=first;i<last;i++){
					llist.add(nums[i]);
				}
				list.add(llist);
				sum-=nums[first++];
			}
			else if(sum<s){
				if(last<nums.length)
					sum+=nums[last++];
				else
					break;
			}
			else
				sum-=nums[first++];
		}
		return list;
	}
}
