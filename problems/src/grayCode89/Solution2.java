package grayCode89;

import java.util.ArrayList;
import java.util.List;

public class Solution2 {
	public List<Integer> grayCode(int n) {
		List<Integer> list = new ArrayList<Integer>();
		for(int i =0;i<(1<<n);i++){
			list.add(i ^ (i>>1));
		}
		return list;
	}
}
