package mergeSortedArray88;

public class Solution {

	
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        if(n!=0){
        	int length = m+n-1;
        	int i = m-1,j=n-1;
        	while(j>=0&&i>=0){
        		nums1[length--]=nums2[j]>=nums1[i]?nums2[j--]:nums1[i--];
        	}
        	while(j>=0){
        		nums1[length--]=nums2[j--];
        	}
        }
    }
}
