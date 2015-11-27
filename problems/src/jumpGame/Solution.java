package jumpGame;

public class Solution {

    public boolean canJump(int[] nums) {
    	int reach = 1;
    	for(int i = 0;i<reach&&reach<nums.length;i++){
    		reach = Math.max(reach, i+nums[i]+1);
    	}
		return reach>=nums.length;
    }
    
    
    public boolean canJump2(int[] nums) {
    	int n = nums.length;
    	int[] f = new int[n];
    	f[0] = 0;
    	for(int i =1;i<n;i++){
    		f[i] = Math.max(f[i-1], nums[i-1])-1;
    		if(f[i]<0) return false;
    	}
    	return f[n-1]>=0;
    }
    
}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    