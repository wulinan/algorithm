package restoreIP93;

import java.util.ArrayList;
import java.util.List;

public class Solution1 {
	public List<String> restoreIpAddresses(String s) {
		List<String> list = new ArrayList<String>();
		for(int i  = 1;i<4&&i<s.length()-2;i++){
			for(int j = i+1;j<i+4&&j<s.length()-1;j++){
				for(int k = j+1;k<j+4&&k<s.length();k++){
					String s1 = s.substring(0,i),s2 = s.substring(i,j),s3 = s.substring(j,k),s4 = s.substring(k,s.length());
					if(isValid(s1)&&isValid(s2)&&isValid(s3)&&isValid(s4))
						list.add(s1+"."+s2+"."+s3+"."+s4);
				}
			}
		}
		return list;
		
	}
	
	public boolean isValid(String s){
		if(s.length()>3||s.length()==0||(s.length()>1&&s.charAt(0)=='0')||Integer.valueOf(s)>255)
			return false;
		return true;
	}
}
