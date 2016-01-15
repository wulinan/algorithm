package spiralMatrix54;

import java.util.ArrayList;
import java.util.List;

public class Solution {

	public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<Integer>();
        int rows = matrix.length;
        int cols = matrix[0].length;
        int min = rows>cols?cols:rows;
        int start = 0;
        while(start*2<min){
        	print(list,matrix,rows,cols,start);
        	start++;
        }
        return list;
    }
	
	public void print(List<Integer> list,int[][] matrix,int rows,int cols,int start){
        int endc = cols-start-1;
        int endr = rows-start-1;
		for(int col = start;col<=endc;col++){
			list.add(matrix[start][col]);
		}
		if(endr>start)
		    for(int row = start+1;row<=endr;row++){
			    list.add(matrix[row][endc]);
		}
		if(endr>start&&endc>start)
			for(int col = endc-1;col>=start;col--)
				list.add(matrix[endr][col]);
		if(endr>start+1&&endc>start)
			for(int row = endr-1;row>start;row--)
				list.add(matrix[row][start]);
		
	}
}
