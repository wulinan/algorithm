package nqueen52;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SolutionI {

	public List<List<String>> solveNQueens(int n) {
		List<List<String>> list = new ArrayList<List<String>>();
		int[][] place = new int[3][n*2];
		int[] col = new int[n];
		search(list,place,col,n,0);
		return list;
        
    }
	
	public void search(List<List<String>> list,int[][] place,int[] col,int n,int cur){
		if(cur==n){
			List<String> llist = new ArrayList<String>(n);
			for(int i = 0;i<n;i++){
				StringBuilder sb = new StringBuilder();
				for(int j = 0;j<n;j++){
					if(j==col[i])
						sb.append('Q');
					else sb.append('.');
				}
				llist.add(sb.toString());
			}
			list.add(llist);
		}else{
			for(int i = 0;i<n;i++){
				if((place[0][i]==0)&&(place[1][cur+i]==0)&&(place[2][cur-i+n]==0)){
					col[cur] = i;
					place[0][i] = place[1][cur+i] = place[2][cur-i+n]=1;
					search(list,place,col,n,cur+1);
					place[0][i] = place[1][cur+i] = place[2][cur-i+n]=0;
				}
			}
		}
		
	}
	
}
