package Binarysearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Binarys350 {

	 public int[] intersect(int[] nums1, int[] nums2) {
	     List<Integer> list=new ArrayList<Integer>();   
		 Arrays.sort(nums1);
		 Arrays.sort(nums2);
		 int i=0;
		 int j=0;
		 while(i<nums1.length&&j<nums2.length) {
			 if(nums1[i]>nums2[j]) {
				 j++;
			 }else if(nums1[i]<nums2[j]) {
				 i++;
			 }else {
				 list.add(nums1[i]);
				 j++;
				 i++;
			 }
		 }
	
		 int[] m=new int[list.size()];
		 for(int k=0;k<list.size();k++) {
			 m[k]=list.get(k);
			// System.out.println(list.get(i));
		 }
		 return m;
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums1= {1,2,2,7,3,4,5,6};
		int[] nums2= {2,3,4,5,9};
		Binarys350 a=new Binarys350();
		int[] m=a.intersect(nums1, nums2);
		for(int i=0;i<m.length;i++) {
			System.out.print(" "+m[i]);
		}
	}

}
