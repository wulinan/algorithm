package reverseWord42;

public class Solution {

	private void reverse(String str){
		int start = 0;
		int end = str.length()-1;
		StringBuilder s = new StringBuilder(str);
		while(start<end){
			char temp = s.charAt(start);
			s.setCharAt(start, s.charAt(end));
			
		}
	}
}
