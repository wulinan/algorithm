package sortColor75;

public class SolutionIII {

	public void sortColors(int[] nums){
		int zero=0,two=nums.length-1;
		for(int i = 0;i<=two;i++){
			while(nums[i]==2&&i<two){
				int temp = nums[i];
				nums[i]=nums[two];
				nums[two] = temp;
				two--;
			}
			while(nums[i]==0&&i>zero){
				int temp = nums[i];
				nums[i]=nums[zero];
				nums[zero]=temp;
				zero++;
			}
		}
	}
}
