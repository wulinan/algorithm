package sortColor75;


public class SolutionII {
	public void sortColors(int[] nums) {
		int n0=-1,n1=-1,n2=-1;
		//�˷��൱����λ�������0����0��1��2�������λ�������1��ֻ����λ2��1�������2��ֻ�����ӱ�����
		for(int i = 0;i<nums.length;i++){
			if(nums[i]==0){
				nums[++n2]=2;nums[++n1]=1;nums[++n0]=0;
			}else if(nums[i]==1){
				nums[++n2]=2;nums[++n1]=1;
			}else nums[++n2]=2;
		}
	}
}
