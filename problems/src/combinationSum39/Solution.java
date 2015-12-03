package combinationSum39;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

	public List<List<Integer>> combinationSum(int[] candidates, int target) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		List<Integer> llist = new ArrayList<Integer>();
		Arrays.sort(candidates);
		combination(list,llist,candidates,target,0);
		return list;
        
    }
	
	public void combination(List<List<Integer>> list,List<Integer> llist,int[] candidates,int target,int begin){
		if(target==0){
			List<Integer> temp= new ArrayList<Integer>(llist);
			list.add(temp);
		}else{
			for(int i=begin;i<candidates.length;i++){
				int diff = target-candidates[i];
				if(diff<0) return ;
				else llist.add(candidates[i]);
				combination(list,llist,candidates,diff,i);
				llist.remove(llist.size()-1);
			}
		}
	}
}
