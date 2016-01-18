package spiralMatrix59;

public class Solution {

	public int[][] generateMatrix(int n) {
        int[][] nums = new int[n][n];
        if(n==0) return nums;
        int start = 0;
        int begin = 1;
        int result = 0;
        while(start*2<n){
        	result = generate(nums,start,n,begin);
        	start++;
        	begin = result;
        }
        return nums;
    }
	
	public int generate(int[][] nums,int start,int n,int begin){
		int end = n-start-1;
		for(int i=start;i<=end;i++){
			nums[start][i] = begin++;
		}
		if(end>0){
			for(int i = start+1;i<=end;i++){
				  nums[i][end] = begin++;
			    }
			for(int i= end-1;i>=start;i--){
				nums[end][i] = begin++;
			}
		}
		if(end>1){
			for(int i = end-1;i>start;i--){
				nums[i][start] = begin++;
			}
		}
		return begin;
	}
}
