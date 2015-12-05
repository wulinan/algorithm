package palindromePartition131;

import java.util.ArrayList;
import java.util.List;

public class Solution1 {
	public List<List<String>> partition(String s) {
		List<List<String>> list = new ArrayList<List<String>>();
		List<String> llist = new ArrayList<String>();
		backtrack(list,llist,s,0);
		return list;
		
	}
	
	public void backtrack(List<List<String>> list,List<String> llist,String s,int begin){
		if(begin==s.length()){
			List<String> temp = new ArrayList<String>(llist);
			list.add(temp);
		}else{
			for(int i = begin;i<s.length();i++){
				if(isPalindrome(s,begin,i)){
					llist.add(s.substring(begin, i+1));
					backtrack(list,llist,s,i+1);
					llist.remove(llist.size()-1);
				}
			}
		}
	}
	
	public boolean isPalindrome(String s,int l,int r){
		if(l==r) return true;
		while(l<r){
			if(s.charAt(l)!=s.charAt(r)) return false;
			l++;
			r--;
		}
		return true;
	}
}
