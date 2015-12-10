package rotateImage48;

public class Solution1 {
	public void rotate(int[][] matrix) {
		int length = matrix.length-1;
		for(int i=0;i<=length;i++){
			for(int j=0;j<=length;j++){
				if(i<length-j){
					int temp = matrix[i][j];
					matrix[i][j] = matrix[length-j][length-i];
					matrix[length-j][length-i] = temp;
			}
			}
		}
		for(int i =0;i<(length+1)/2;i++){
			int[] temp = matrix[i];
			matrix[i] = matrix[length-i];
			matrix[length-i] = temp;
		}
	}

}
