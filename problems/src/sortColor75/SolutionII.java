package sortColor75;


public class SolutionII {
	public void sortColors(int[] nums) {
		int n0=-1,n1=-1,n2=-1;
		//此法相当于移位。如果是0，将0，1，2均向后移位；如果是1，只需移位2和1；如果是2，只需增加本身即可
		for(int i = 0;i<nums.length;i++){
			if(nums[i]==0){
				nums[++n2]=2;nums[++n1]=1;nums[++n0]=0;
			}else if(nums[i]==1){
				nums[++n2]=2;nums[++n1]=1;
			}else nums[++n2]=2;
		}
	}
}
