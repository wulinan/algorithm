package mergeIntervals56;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Interval {
	 int start;
	 int end;
	 Interval() { start = 0; end = 0; }
	 Interval(int s, int e) { start = s; end = e; }
	 }
public class Solution {

	public List<Interval> merge(List<Interval> intervals) {
        int length = intervals.size();
        List<Interval> list = new ArrayList<Interval>();
        if(length==0) return list;
		Interval[] array = intervals.toArray(new Interval[length]);
		qsort(array,0,length-1);
		for(int i=0;i<length;i++){
			Interval temp = new Interval();
			temp.start = array[i].start;
			int end = array[i].end;
			while(i+1<length&&(array[i+1].start<=end)){//一定注意应该与最大的end比较！！！！！！
				end = end>=array[i+1].end?end:array[i+1].end; 
				i++;
			}
			temp.end = end;
			list.add(temp);
		}
		return list;
    }
	
	public int partition(Interval[] inter,int start,int end){
		Random random = new Random();
		int index = random.nextInt(end-start+1)+start;
		Interval temp = inter[index];
		inter[index] = inter[end];
		inter[end] = temp;
		int small = start-1;
		for(int i = start;i<end;i++){
			if(inter[i].start<inter[end].start){
				small++;
				if(small!=i){
					temp = inter[i];
					inter[i] = inter[small];
					inter[small] = temp;
				}
			}
		}
		small++;
		temp = inter[small];
		inter[small] = inter[end];
		inter[end] = temp;
		return small;
	}
	
	public void qsort(Interval[] inter,int start,int end){
		if(start==end) return;
		int index = partition(inter,start,end);
		if(index>start)
			qsort(inter,start,index-1);
		if(index<end)
			qsort(inter,index+1,end);
	}
}
