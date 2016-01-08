package combination28;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        SolutionI s = new SolutionI();
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        int[] nums = {1,2,3};
        list = s.combination(nums);
        for(List<Integer> llist:list){
        	for(int e:llist){
        		System.out.print(e);
        	}
        	System.out.println();
        }
	}

}
