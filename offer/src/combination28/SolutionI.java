package combination28;

import java.util.ArrayList;
import java.util.List;

public class SolutionI {

	public List<List<Integer>> combination(int[] nums){
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		int n = nums.length;
		for(int i=0;i<(1<<n);i++){
			List<Integer> llist = new ArrayList<Integer>();
			for(int j = 0;j<n;j++){
				if((i&(1<<j))!=0)
					llist.add(nums[j]);
			}
			list.add(llist);
		}
		return list;
	}
}
