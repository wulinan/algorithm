package arrayToSmallestNum33;

import java.util.Random;

public class Solution {
	
	private boolean compare(String s1,String s2){
		String ss1 = s1+s2;
		String ss2 = s2+s1;
		return (ss1.compareTo(ss2)<0)?true:false;
	}

	private int partition(String[] str,int begin,int end){
		Random random = new Random();
		int index = random.nextInt(end-begin+1)+begin;
		String temp = str[end];
		str[end] = str[index];
		str[index] = temp;
		int small = begin-1;
		for(int i =begin;i<end;i++){
			if(compare(str[i],str[end])){
				small++;
				if(small!=i){
					temp = str[i];
					str[i] = str[small];
					str[small] = temp;
				}
			}
		}
		small++;
		temp = str[small];
		str[small] = str[end];
		str[end] = temp;
		return small;
	}
	
	private void qsort(String[] str,int begin,int end){
		int index = partition(str,begin,end);
		if(index>begin)
			qsort(str,begin,index-1);
		if(index<end)
			qsort(str,index+1,end);
	}
	
	public String minNumber(int[] nums){
		if(nums.length==0) return null;
		if(nums.length==1) return nums[0]+"";
		String[] str = new String[nums.length];
		for(int i = 0;i<nums.length;i++){
			str[i] = nums[i]+"";
		}
		qsort(str,0,str.length-1);
		StringBuilder sb = new StringBuilder();
		for(int i = 0;i<str.length;i++){
			sb.append(str[i]);
		}
		return sb.toString();
	}
}
