package grayCode89;

import java.util.ArrayList;
import java.util.List;

public class Solution1 {
	public List<Integer> grayCode(int n) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(0);
		for(int i =0;i<n;i++){
			int temp = 1<<i;
			for(int j = list.size()-1;j>=0;j--){
				list.add(list.get(j)+temp);
			}
		}
		return list;
		
	}
}
