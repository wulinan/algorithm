package palindromePartition131;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Solution s = new Solution();
        Solution1 s1 = new Solution1();
        List<List<String>> list = new ArrayList<List<String>>();
        list = s1.partition("abccbabb");
        System.out.println(list);
	}

}
