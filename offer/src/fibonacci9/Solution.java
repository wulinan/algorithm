package fibonacci9;

public class Solution {

	public int fibonacci(int num){
		if(num==0) return 0;
		if(num==1) return 1;
		int fibone = 1;
		int fibtwo = 0;
		int fibn = 0;
		for(int i =2;i<=num;i++){
			fibn = fibone+fibtwo;
			fibtwo = fibone;
			fibone = fibn;
		}
		return fibn;
	}
}
