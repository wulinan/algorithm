package uglyNumber34;

public class SolutionI {

	public int uglyNumber(int n){
		int[] nums = new int[n];
		nums[0] =1;
		int nextNumber =1;
		int index2=0,index3=0,index5=0;
		int factor2=2,factor3=3,factor5=5;
		while(nextNumber<n){
			int min = Math.min(factor2, Math.min(factor3, factor5));
			nums[nextNumber] = min;
			if(factor2==min)
				factor2 = 2*nums[++index2];
			if(factor3==min)
				factor3 = 3*nums[++index3];
			if(factor5==min)
				factor5 = 5*nums[++index5];
			nextNumber++;
		}
		return nums[nextNumber-1];
	}
}
