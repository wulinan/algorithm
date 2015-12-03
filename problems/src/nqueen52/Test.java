package nqueen52;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        SolutionI s = new SolutionI();
        
        List<List<String>> list ;
        list = s.solveNQueens(4);
        //System.out.print(list);
        for(int i =0;i<list.size();i++){
        	for(int j = 0;j<list.get(0).size();j++){
        		System.out.println(list.get(i).get(j));
        	}
        	System.out.println();
        }
	}

}
