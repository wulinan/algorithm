package combination77;

import java.util.ArrayList;
import java.util.List;

public class Solution {

	public List<List<Integer>> combine(int n, int k) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		int[] nums = new int[k];
		search(list,nums,n,k,0,1);
		return list;
        
    }
	
	public void search(List<List<Integer>> list,int[] nums,int n,int k,int cur,int begin){
		if(k==0){
			List<Integer> llist = new ArrayList<Integer>();
			for(int i = 0;i<cur;i++){
				llist.add(nums[i]);
			}
			list.add(llist);
		}else{
			for(int i =begin;i<=n-k+1;i++){
				nums[cur] = i;
				search(list,nums,n,k-1,cur+1,i+1);
			}
		}
	}
}
