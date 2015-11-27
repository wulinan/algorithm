package steps;

public class Solution {
	int[] stairs = new int[1048];
	 public int climbStairs(int n) {
		 
		 stairs[1]=1;
		 stairs[2]=2;
		 if(n==1||n==0){
			 return 1;
		 }else if(n==2){
			 return 2;
		 }else{
			 stairs[n]=climbStairs(n-1)+stairs[n-2];
			 System.out.println(stairs[n-2]);
			 return stairs[n];
		 }  
	    }
}
