package pukeIsContinuous44;

import java.util.Random;

public class Solution {

	private int partition(int[] nums,int start,int end){
		Random random = new Random();
		int index = random.nextInt(end-start+1)+start;
		int temp = nums[index];
		nums[index] = nums[end];
		nums[end] = temp;
		int small = start -1;
		for(int i = start;i<end;i++){
			if(nums[i]<nums[end]){
				small++;
				if(small!=i){
					temp = nums[i];
					nums[i] = nums[end];
					nums[end] = temp;
				}
			}
		}
		small++;
		temp = nums[small];
		nums[small] = nums[end];
		nums[end] = temp;
		return small;
	}
	
	private void qsort(int[] nums,int start,int end){
		int index = partition(nums,start,end);
		if(index>start)
			qsort(nums,start,index-1);
		if(index<end)
			qsort(nums,index+1,end);
	}
	
	public boolean isContinuous(int[] nums){
	    if(nums.length!=5) return false;
		qsort(nums,0,nums.length-1);
		int numsZero = 0;
		int numsGap = 0;
		for(int i =0;i<nums.length&&nums[i]==0;i++){
			numsZero++;
		}
		int small = numsZero;
		int big = small+1;
		while(big<nums.length){
			if(nums[small]==nums[big])
				return false;
			numsGap += nums[big]-nums[small]-1;
			small = big;
			big++;
		}
		return numsGap>numsZero?false:true;
	}
}
