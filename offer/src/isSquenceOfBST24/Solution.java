package isSquenceOfBST24;

public class Solution {

	public boolean verifySquenceOfBST(int[] seq){
		if(seq.length==0)
			return false;
		return Sequence(seq,0,seq.length-1);
	}
	
	public boolean Sequence(int[] seq,int start,int end){
		if(start==end||start+1==end) return true;
		int i=start,j=end-1;
		if(seq[start]>seq[end]){
			for(int k=start;k<end;k++){
				if(seq[k]<seq[end])
					return false;
			}
		}
		if(seq[end-1]<seq[end]){
			for(int k=start;k<end;k++){
				if(seq[k]>seq[end])
					return false;
			}
		}
		while(i<j-1){
			int mid = (i+j)/2;
			if(seq[mid]>seq[end])
				j=mid-1;
			if(seq[mid]<seq[end])
				i=mid;
		}
		return Sequence(seq,start,i)&&Sequence(seq,i+1,end-1);
	}
}
