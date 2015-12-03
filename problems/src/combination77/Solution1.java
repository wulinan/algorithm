package combination77;

import java.util.ArrayList;
import java.util.List;

public class Solution1 {
	public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
		for(int i=0;i<(1<<n);i++){
			search(list,n,k,i);
		}
		return list;
    }
    
    public void search(List<List<Integer>> list ,int n,int k,int s){
		List<Integer> llist = new ArrayList<Integer>();
		for(int i = 0;i<n;i++){
		    if((s&(1<<i))!=0&&k-->0){
		    	llist.add(i+1);
		    }
		}
		if(k==0) list.add(llist);
	}
}
