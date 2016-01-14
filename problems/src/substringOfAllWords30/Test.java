package substringOfAllWords30;

import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Solution s = new Solution();
        String str= "wordgoodgoodgoodbestword";
        		

        String[] words={"word","good","best","good"};
        List<Integer> list = s.findSubstring(str, words);
        System.out.println(list);
	}

}
