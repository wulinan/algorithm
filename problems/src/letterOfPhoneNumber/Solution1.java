package letterOfPhoneNumber;

import java.util.ArrayList;
import java.util.List;

public class Solution1 {
	public List<String> letterCombinations(String digits) {
		List<String> list = new ArrayList<String>();
        if(digits.length()==0) return list;
        String[] key = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        list.add("");
        for(int i = 0;i<digits.length();i++){
        	List<String> temp = new ArrayList<String>();
        	for(int j =0;j<key[digits.charAt(i)-'0'].length();j++){
        		for(int k= 0;k<list.size();k++){
        			temp.add(list.get(k)+key[digits.charAt(i)-'0'].charAt(j));
        		}
        		list = temp;
        	}
        }
        return list;
	}
}
