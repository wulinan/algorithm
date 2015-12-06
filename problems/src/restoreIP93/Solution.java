package restoreIP93;

import java.util.ArrayList;
import java.util.List;

public class Solution {

	public List<String> restoreIpAddresses(String s) {
		List<String> list = new ArrayList<String>();
		if(s.length()<4) return list;
		String str = "";
		backtrack(list,str,s,0,0);
		return list;        
    }
	
	public void backtrack(List<String> list,String str,String s,int cur,int begin){
		if(cur==3){
			if(s.length()-begin>0&&s.length()-begin<=3){
				String ss = s.substring(begin);
				if((s.length()-begin==1||ss.charAt(0)!='0')&&Integer.valueOf(ss)<=255){
					str+=s.substring(begin);
					list.add(str);
			}
			}else return;
			
		}else if(s.length()-begin>0){
			for(int i = begin;i<begin+3&&i<s.length();i++){
				String ss = s.substring(begin, i+1);
				if((i+1-begin==1||ss.charAt(0)!='0')&&Integer.valueOf(ss)<=255){
					backtrack(list,str+ss+".",s,cur+1,i+1);
				}else return;
			}
		}
	}
}
