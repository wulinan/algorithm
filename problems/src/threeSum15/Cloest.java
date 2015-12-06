package threeSum15;

import java.util.Arrays;

public class Cloest {

	public int threeSumClosest(int[] nums, int target) {
		int sum = 0;
		int diff = Integer.MAX_VALUE;
		Arrays.sort(nums);
		for(int i =0;i<nums.length-2;i++){
			int j = i+1;
			int k = nums.length-1;
			while(j<k){
				int temp = nums[i]+nums[j]+nums[k];
				int d = Math.abs(temp-target);
			    if(d<diff){
			    	diff = d;
			    	sum = temp;
			    }
			    if(temp<target) j++;
			    else if(temp>target) k--;
			    else return target;
			}
		}
		return sum;
    }
}
