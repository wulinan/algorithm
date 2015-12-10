package rotateImage48;

public class Solution {

	public void rotate(int[][] matrix) {
		int row = matrix.length;
		int col = matrix[0].length;
        int[][] temp = new int[row][col];
        for(int i =0;i<row;i++){
        	for(int j = 0;j<col;j++){
        		temp[i][j] = matrix[i][j];
        	}
        }
        for(int i=0;i<row;i++){
        	for(int j=0;j<col;j++){
        		matrix[j][row-1-i] = temp[i][j];
        	}
        }
    }
}
