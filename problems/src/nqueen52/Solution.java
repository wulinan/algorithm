package nqueen52;

import java.util.Arrays;

public class Solution {
    int num = 0;
	public int totalNQueens(int n) {
		int[][] place = new int[3][2*n];
		search(place,n,0);
		return num;
    }
	
	public void search(int[][] place,int n,int cur){//cur代表当前行
		if(cur==n){
			num++;
			return;
		}
		for(int i =0;i<n;i++){//查找能够放的列
			if((place[0][i]==0)&&(place[1][cur+i]==0)&&(place[2][cur-i+n]==0)){
				place[0][i] = place[1][cur+i] = place[2][cur-i+n] = 1;
				search(place,n,cur+1);
				place[0][i] = place[1][cur+i] = place[2][cur-i+n] = 0;
			}
		}
	}
}
