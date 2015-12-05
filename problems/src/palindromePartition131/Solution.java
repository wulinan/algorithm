package palindromePartition131;

import java.util.ArrayList;
import java.util.List;

public class Solution {

	public List<List<String>> partition(String s) {
		List<List<String>> list = new ArrayList<List<String>>();
		List<String> llist = new ArrayList<String>();
		for(int i = 0;i<s.length();i++){
			llist.add(s.charAt(i)+"");
		}
		list.add(llist);
		for(int i =0;i<list.size();i++){
			palindrome(list,list.get(i));
		}
		return list;
    }
	
	public void palindrome(List<List<String>> list,List<String> llist){
		for(int i = 0;i<llist.size();i++){
			if(i>0&&i+1<llist.size()&&llist.get(i-1).equals(llist.get(i+1))){
				String s = llist.get(i-1)+llist.get(i)+llist.get(i+1);
				List<String> temp = new ArrayList<String>(llist);
				temp.set(i-1, s);
				temp.remove(i);
				temp.remove(i+1-1);
				System.out.println("dan"+i+"-"+":"+temp);
				if(!list.contains(temp)) list.add(temp);
			}
			if(i+1<llist.size()&&llist.get(i).equals(llist.get(i+1))){
				String s = llist.get(i)+llist.get(i+1);
				List<String> temp = new ArrayList<String>(llist);
				temp.set(i, s);
				temp.remove(i+1);
				System.out.println("shuang"+i+"-"+":"+temp);
				if(!list.contains(temp)) list.add(temp);
			}
		}
	}
}
