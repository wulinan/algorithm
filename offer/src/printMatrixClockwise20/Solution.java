package printMatrixClockwise20;

public class Solution {

	public void printMatrixClockwisely(int[][] nums){
		int rows = nums.length;
		int columns = nums[0].length;
		int start = 0;
		while(rows>start*2&&columns>start*2){
			printMatrix(nums,rows,columns,start);
			start++;
		}
	}
	
	public void printMatrix(int[][] nums,int rows,int columns,int start){
		int endx = columns-start-1;
		int endy = rows-start-1;
		for(int i=start;i<=endx;i++){
			System.out.print(nums[start][i]);
		}
		if(start<endy){
			for(int i =start+1;i<=endy;i++){
				System.out.print(nums[i][endx]);
			}
		}
		if(start<endx&&start<endy){
			for(int i= endx-1;i>=start;i--){
				System.out.print(nums[endy][i]);
			}
		}
		if(start<endy-1&&start<endx){
			for(int i=endy-1;i>start;i--){
				System.out.print(nums[i][start]);
			}
		}
	}
}
