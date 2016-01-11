package arrayMoreThanHalf29;

import java.util.Random;

public class Solution {
	
	public int moreThanHalf(int[] nums){
		int length = nums.length;
		int mid = (length>>1)+1;
		int start = 0;
		int end = length-1;
		int index = partition(nums,start,end);
		while(index!=mid){
			if(index>mid)
				index = partition(nums,start,index-1); 
			if(index<mid)
				index = partition(nums,index+1,end);
		}
		if(!checkMoreThanHalf(nums,index))
			return 0;
		return nums[index];
	}

	public int partition(int[] nums,int start,int end){
		int length = nums.length;
		Random random = new Random();
		int index = random.nextInt(length);
		int temp = nums[end];
		nums[end] = nums[index];
		nums[index] = temp;
		int smaller = start-1;
		for(int i= start;i<end;i++){
			if(nums[i]<nums[end]){
				smaller++;
				if(smaller!=i){
					temp = nums[smaller];
					nums[smaller] = nums[i];
					nums[i] = temp;
				}
			}
		}
		++smaller;
		temp = nums[end];
		nums[end] = nums[smaller];
		nums[smaller] = temp;
		return smaller;
	}
	
	
	public boolean checkMoreThanHalf(int[] nums,int index){
		int count = 0;
		for(int i = 0;i<nums.length;i++){
			if(nums[i]==nums[index])
				count++;
		}
		if(count*2<=nums.length)
			return false;
		return true;
	}
}
