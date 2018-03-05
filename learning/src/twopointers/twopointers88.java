package twopointers;

public class twopointers88 {

	public void mergearray(int[] nums1,int[] nums2,int m,int n) {
		
		for(int i=m;i<m+n;i++) {
			nums1[i]=nums2[i-m];
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int[] nums1= {1,2,4,5,7,0,0,0,0,0};
		int[] nums2= {1,2,3,4,5};
		twopointers88 a=new twopointers88();
		a.mergearray(nums1, nums2, 5, 5);
		for(Integer i:nums1) {
			System.out.print(" "+i);
		}
	
	
	}

}
