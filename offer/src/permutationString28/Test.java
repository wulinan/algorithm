package permutationString28;

import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Solution s = new Solution();
        String str = "2211";
        List<String> list = s.permutation(str);
        for(String ss:list){
        	System.out.println(ss);
        }
	}

}
