package rangeSumQuery2D;

public class NumMatrix {

	int[][] matrix;
	public NumMatrix(int[][] matrix) {
		if(matrix==null||matrix.length==0||matrix[0].length==0) return;
        for(int i=0;i<matrix.length;i++){
        	for(int j = 1;j<matrix[0].length;j++){
        		matrix[i][j]+=matrix[i][j-1];
        	}
        }
        for(int j = 0;j<matrix[0].length;j++){
        	for(int i = 1;i<matrix.length;i++){
        		matrix[i][j]+=matrix[i-1][j];
        	}
        }
        this.matrix = matrix;
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
    	if(col1==0&&row1==0) return matrix[row2][col2];
    	else if(col1==0) return matrix[row2][col2]-matrix[row1-1][col2];
    	else if(row1==0) return matrix[row2][col2]-matrix[row2][col1-1];
		return matrix[row2][col2]-matrix[row2][col1-1]-matrix[row1-1][col2]+matrix[row1-1][col1-1];
    }
}
