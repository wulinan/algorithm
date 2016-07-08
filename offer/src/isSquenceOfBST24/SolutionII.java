package isSquenceOfBST24;

public class SolutionII {

	public boolean VerifySquenceOfBST(int [] sequence) {
        int length = sequence.length;
        if(length==0) return false;
        return verify(sequence,0,length-1);
    }
    
    boolean verify(int[] sequence,int start,int end){
    	if(start==end) return true;
        int i = start;
        for(;i<end;i++){
            if(sequence[i]>sequence[end])
                break;
        }
        int j = i;
        for(;i<end;i++){
            if(sequence[i]<sequence[end])
                return false;
        }
        boolean left = true;
        boolean right = true;
        if(j>start)
        	left = verify(sequence,start,j-1);
        if(j<=end)
        	right = verify(sequence,j,end-1);
        return (left&&right);
    }
}
