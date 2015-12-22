package singleNumber136;

public class SolutionII {

	public int singleNumber(int[] nums) {
		int one = 0,two = 0,three = 0;
		for(int i =0;i<nums.length;i++){
			three = two&nums[i];//����3�ε����Ѿ�����2�εĺ��ٴγ��ֵ�
			two = two | (one & nums[i]);//����2�ε����Ѿ��������εĺ��Ѿ�����һ�εĲ����ٴγ��ֵ�
			one = one | nums[i];//����1�ε����Ѿ�����һ�εļ��ϼ������ֵġ�
			
			two &= ~three;//������3�ε���0
			one &= ~three;//������3�ε���0
		}
		return one;
        
    }
}
