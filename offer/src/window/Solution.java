package window;

import java.util.ArrayList;

public class Solution {

	public ArrayList<Integer> maxInWindows(int [] num, int size)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int length = num.length;
        if(length<=0||size>length ||size<=0) return list;
        int start = 0;
        int end = size-1;
        int max = Integer.MIN_VALUE;
        int index = 0;
        while(end<length){
            if(start==0||index<start){
            	max = Integer.MIN_VALUE;
                for(int i = start;i<=end;i++){
            		if(num[i]>max){
                       max = num[i];
                        index = i;
                    }
       			 }
            }else if(num[index]<num[end]){
            	 max = num[end];
            	 index = end;
            }
            list.add(max);
            start++;
            end++;
        }
        return list;
    }
	
	public static void main(String[] args){
		Solution s = new Solution();
		int[] num = {2,3,4,2,6,2,5,1};
		ArrayList<Integer> list = s.maxInWindows(num, 3);
		System.out.println(list);
	}
}
