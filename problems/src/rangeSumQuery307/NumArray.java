package rangeSumQuery307;

public class NumArray {

	int[] nums;
	public NumArray(int[] nums) {
        for(int i = 1;i<nums.length;i++){
        	nums[i]+=nums[i-1];
        }
        this.nums = nums;
    }

    void update(int i, int val) {
    	
    		int diff= i==0?nums[i]-val:nums[i]-nums[i-1]-val;
        	for(int index = i;index<nums.length;index++){
        	      nums[index]-=diff;	
        	}
    }

    public int sumRange(int i, int j) {
        if(i==0) return nums[j];
        return nums[j]-nums[i-1];
    }
}
