package singleNumber136;

import java.util.HashSet;

public class SolutionIIItwo {
	public int[] singleNumber(int[] nums) {
		int[] result = new int[2];
		HashSet<Integer> set = new HashSet<Integer>();
		for(int num:nums){
			if(set.contains(num)) set.remove(num);
			else set.add(num);
		}
		int i=0;
		for(int e:set){
			result[i++] = e;
		}
		return result;
	}
}
