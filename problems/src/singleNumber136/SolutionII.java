package singleNumber136;

public class SolutionII {

	public int singleNumber(int[] nums) {
		int one = 0,two = 0,three = 0;
		for(int i =0;i<nums.length;i++){
			three = two&nums[i];//出现3次的由已经出现2次的和再次出现的
			two = two | (one & nums[i]);//出现2次的由已经出现两次的和已经出现一次的并且再次出现的
			one = one | nums[i];//出现1次的由已经出现一次的加上即将出现的。
			
			two &= ~three;//将出现3次的置0
			one &= ~three;//将出现3次的置0
		}
		return one;
        
    }
}
