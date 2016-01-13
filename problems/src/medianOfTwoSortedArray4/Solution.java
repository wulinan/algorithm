package medianOfTwoSortedArray4;

public class Solution {

	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int total = m+n;
        if((total&1)==1)
        	return findMedian(nums1,0,m,nums2,0,n,total/2+1);
        else return (findMedian(nums1,0,m,nums2,0,n,total/2)+findMedian(nums1,0,m,nums2,0,n,total/2+1))/2.0;
    }
	
	public int findMedian(int[] nums1,int start1,int m,int[] nums2,int start2,int n,int k){
		if(m>n) return findMedian(nums2,start2,n,nums1,start1,m,k);
		if(m==0) return nums2[start2+k-1];
		if(k==1) return nums1[start1]<nums2[start2]?nums1[start1]:nums2[start2];
		
		int a = k/2<m?k/2:m;
		int b = k-a;
		if(nums1[start1+a-1]<nums2[start2+b-1])
			return findMedian(nums1,start1+a,m-a,nums2,start2,n,k-a);
		else if(nums1[start1+a-1]>nums2[start2+b-1])
			return findMedian(nums1,start1,m,nums2,start2+b,n-b,k-b);
		else return nums1[start1+a-1];
	}
}
