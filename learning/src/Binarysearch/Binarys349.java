package Binarysearch;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Binarys349 {

public int[] intersection(int[] nums1, int[] nums2) {
     
	Set<Integer> set =new HashSet();
	int i=0;
	while(i<nums1.length) {
		for(int j=0;j<nums2.length;j++) {
			if(nums1[i]==nums2[j]) {
				set.add(nums1[i]);
			}
		}
		
		
		i++;
	}
//	for(Integer e:set ) {
//		System.out.print(e);
//	}
	Iterator<Integer> it=set.iterator();
	
	//int q=0;
	int k=0;
	int [] res=new int[set.size()];
	while(it.hasNext()) {
		res[k]=it.next();
		k++;
	}
	return res;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums1= {1,2,2,3,4,5};
		int[] nums2= {2,3,4};
		Binarys349 a=new Binarys349();
		int[] r=a.intersection(nums1, nums2);
		for(int i=0;i<r.length;i++) {
			System.out.println(r[i]);
		}
		
	}

}
