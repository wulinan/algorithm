package singleNumber136;

public class SolutionIII {

	public int[] singleNumber(int[] nums) {
	    int num = 0;
	    int[] result = {0,0};
	    for(int i =0;i<nums.length;i++){
	    	num ^= nums[i];
	    }
	    int lastbit = num & (-num);
	    for(int i =0;i<nums.length;i++){
	    	if((result[0] & lastbit)==0){
	    		result[0] ^= nums[i];
	    	}else result[1] ^= nums[i];
	    }
		return result;
    }
}
