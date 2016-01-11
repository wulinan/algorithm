package getKnumbers30;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Solution {

	public int partition(int[] nums,int start,int end){
		int length = nums.length;
		Random random = new Random();
		int index = random.nextInt(end-start+1)+start;
		int temp = nums[end];
		nums[end] = nums[index];
		nums[index] = temp;
		int small = start-1;
		for(int i=start;i<end;i++){
			if(nums[i]<nums[end]){
				small++;
				if(small!=i){
					temp = nums[i];
					nums[i] = nums[small];
					nums[small] = temp;
				}
			}
		}
		small++;
		temp = nums[small];
		nums[small] = nums[end];
		nums[end] = temp;
		return small;
	}
	
	public List<Integer> getKnumbers(int[] nums,int k){
		List<Integer> list = new ArrayList<Integer>();
		int length = nums.length;
		if(k>length) return list;
		if(k==length){
			for(int e:nums){
				list.add(e);
			}
			return list;
		}
		int start = 0;
		int end = nums.length-1;
		int index = partition(nums,start,end);
		System.out.println(index);
		for(int e:nums){
			System.out.print(e);
		}
		System.out.println();
		while(index!=k-1){
			if(index<k-1){
				start = index+1;
				index = partition(nums,start,end);
				System.out.println(index);
				for(int e:nums){
					System.out.print(e);
				}
				System.out.println();
			}else{
				end = index-1;
				index = partition(nums,start,end);
				System.out.println(index);
				for(int e:nums){
					System.out.print(e);
				}
				System.out.println();
			}
		}
		for(int i=0;i<k;i++){
			list.add(nums[i]);
		}
		return list;
	}
}
