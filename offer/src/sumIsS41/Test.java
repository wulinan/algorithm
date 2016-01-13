package sumIsS41;

import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ContinuousSequence s = new ContinuousSequence();
        int[] nums = {1,2,3,4,5,6,7,8};
        List<List<Integer>> list = s.continuousSequence(nums, 1);
        System.out.println(list);
	}

}
