package generateParentheses22;

import java.util.ArrayList;
import java.util.List;

public class Solution {

	public List<String> generateParenthesis(int n) {
		List<String> list = new ArrayList<String>();
		String str = "";
		generate(list,str,n,0);
		return list;
    }
	
	public void generate(List<String> list,String str,int n,int m){
		if(n==0&&m==0){
			list.add(str);
		}else{
			if(m>0) generate(list,str+")",n,m-1);
			if(n>0) generate(list,str+"(",n-1,m+1);
		}
	}
}
