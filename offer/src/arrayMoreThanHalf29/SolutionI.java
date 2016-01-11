package arrayMoreThanHalf29;

public class SolutionI {

	public int moreThanHalf(int[] nums){
		int result = nums[0];
		int count = 1;
		for(int i =1;i<nums.length;i++){
			if(count==0){
				result = nums[i];
				count = 1;
			}else if(nums[i]==result)
				count++;
			else count--;
		}
		if(!checkMoreThanHalf(nums,result))
             return 0;
        return result;
	}

	private boolean checkMoreThanHalf(int[] nums, int result) {
		// TODO Auto-generated method stub
		int count = 0;
		for(int i =0;i<nums.length;i++){
			if(nums[i]==result)
				count++;
		}
		if(count*2<=nums.length)
			return false;
		return true;
	}
}
