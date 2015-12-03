package letterOfPhoneNumber;

import java.util.ArrayList;
import java.util.List;

public class Solution {

	public List<String> letterCombinations(String digits) {
		List<String> list = new ArrayList<String>();
        if(digits.length()==0) return list;
        String[] key = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
		String s = "";
		combination(key,list,digits,s,0);
		return list;
    }
	
	public void combination(String[] key,List<String> list,String digits,String s,int cur){
		if(cur==digits.length()){
			list.add(s);
		}else{
			for(int i = 0;i<key[digits.charAt(cur)-'0'].length();i++){
				combination(key,list,digits,s+key[digits.charAt(cur)-'0'].charAt(i),cur+1);
			}
		}
	}
}
