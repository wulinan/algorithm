package inAndPreToBack;

public class Solution {

	int index = 0;
	public int[] construct(int[] pre,int[] in){
		int start = 0;
		int end = in.length-1;
		int cur = 0;
		constructCore(pre,in,start,end,cur);
		return in;
	}
	
	public int[] construct1(int[] pre,int[] in){
		int start = 0;
		int end = in.length;
		int cur = 0;
		int[] result = new int[in.length];
		constructCore1(result,pre,in,start,end,cur);
		return result;
	}
	
	public void constructCore(int[] pre,int[] in,int start,int end,int cur){
		if(start==end) return;
		int i = start;
		for(;i<=end;i++){
			if(pre[cur]==in[i])
				break;
		}
		if(i>end) return;
		if(i>start)
			constructCore(pre,in,start,i-1,cur+1);
		if(i<end){
			int j = i;
			for(;j<end;j++){
				int temp = in[j];
				in[j] = in[j+1];
				in[j+1] = temp;
			}
			constructCore(pre,in,i,end-1,cur+i-start+1);
		}
	}
	
	public void constructCore1(int[] result,int[] pre,int[] in,int start,int end,int cur){
		if(start==end){
			//result[index++] = in[start];
			return;
		}
		int i = start;
		for(;i<end;i++){
			if(pre[cur]==in[i])
				break;
		}
		constructCore1(result,pre,in,start,i,cur+1);
	    constructCore1(result,pre,in,i+1,end,cur+i-start+1);
		System.out.print(pre[cur]);
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Solution s = new Solution();
        int[] pre = {1,2,4,7,3,5,6,8};
        int[] in = {4,7,2,1,5,3,8,6};
//        s.construct(pre, in);
//        for(int i = 0;i<in.length;i++){
//        	System.out.print(in[i]);
//        }
//        System.out.println();
        s.construct1(pre, in);
//        for(int i = 0;i<result.length;i++)
//        	System.out.print(result[i]);
}

}
