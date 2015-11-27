package remove;

public class Solution {

public int removeElement(int[] nums, int val) {
	int length = nums.length-1;
	if(nums.length==0){
		return 0;
	}else{
		for(int i = nums.length-1;i>=0;i--){
			if(nums[i]==val){
				nums[i]=nums[length];
				length--;
				}
		}
//		for (int j = 0;j<=length;j++){
//			System.out.println(nums[j]);
//		}
		return length+1;
	}  
    }
}
