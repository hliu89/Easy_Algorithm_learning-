package twopointers;

import java.util.HashSet;
import java.util.Set;

public class twopointers26 {

	public int removeduplicate(int[] x) {
		Set<Integer> set=new HashSet();
		
		for(int i=0;i<x.length;i++) {
				set.add(x[i]);		
		}
		for(Integer i:set) {
			System.out.print(i+" ");
		}
		return set.size();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] x= {1,2,3,4,5,6,7,8,9,9,2,6,10};
		twopointers26 a=new twopointers26();
		System.out.println(a.removeduplicate(x));
		
		
	}

}
