package combinationSum39;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SolutionIII {
  
	public List<List<Integer>> combinationSum3(int k, int n) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		List<Integer> llist = new ArrayList<Integer>(k);
		combination(list,llist,k,n,1);
		return list;
    }
	
	public void combination(List<List<Integer>> list,List<Integer> llist,int k,int n,int begin){
		if(n==0&&k==0){
			List<Integer> temp= new ArrayList<Integer>(llist);
			list.add(temp);
		}
		else if(n!=0&&k!=0){
			for(int i = begin;i<=9;i++){
				int target = n-i;
				if(target<0) break;
				llist.add(i);
				combination(list,llist,k-1,target,i+1);
				llist.remove(llist.size()-1);
			}
		}else return;
	}
}
