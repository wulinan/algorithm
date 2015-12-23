package reverseWordInString151;

public class Solution1 {
	public String reverseWords(String s) {
		String result = "";
		String[] str = s.trim().split("\\s+");
		if(str.length==0) return "";
		System.out.println(str.length);
		for(int i =str.length-1;i>0;i--){
			result+=str[i]+" ";
		}
		result+=str[0];
		return result;
	}
}
