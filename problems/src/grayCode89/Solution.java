package grayCode89;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	 public List<Integer> grayCode(int n) {
		 List<Integer> list = new ArrayList<Integer>();
		 int begin = 0;
		 list.add(0);
		 for(int i = 0;i<(1<<n);i++){
			 int temp = 0;
			 for(int j =0;j<n;j++){
				 temp = begin ^ (1<<j); 
				 if(!list.contains(temp)){
					 list.add(temp);
					 break;
				 }
			 }
			 begin = temp;
		 }
	        return list;
	    }
	 
//	 public void code(List<Integer> list,int n,int begin){
//		 
//		 for(int i =0;i<n;i++){
//			 int temp = begin ^ (1<<i); 
//			 if(!list.contains(temp)){
//				 list.add(temp);
//				 break;
//			 }
//		 }
//	 }
}
