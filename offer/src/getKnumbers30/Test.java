package getKnumbers30;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Solution s = new Solution();
        List<Integer> list = new ArrayList<Integer>();
        int[] nums={4,5,1,6,2,7,3,8};
        list = s.getKnumbers(nums, 4);
        for(int e:list){
        	System.out.print(e);
        }
	}

}
