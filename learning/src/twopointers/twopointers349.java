package twopointers;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class twopointers349 {

	public int[] intersection(int[] m,int[] n) {
		Set<Integer> set=new HashSet<Integer>();
		for(int i=0;i<m.length;i++) {
			for(int j=0;j<n.length;j++) {
				if(m[i]==n[j]) {
					set.add(m[i]);
				}
			}
		}
		int[] q=new int[set.size()];
		 Iterator<Integer> s=set.iterator();
		 int i=0;
		 while(s.hasNext()) {
			 q[i]=s.next();
			 i++;
		 }
		return q;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] m= {1,2,4,5,6,7,7,7,8};
		int[] n= {5,1,3,4,4,4,4,7,6,9,0};
		twopointers349 a=new twopointers349();
		int [] q=a.intersection(m, n);
		for(Integer i:q) {
			System.out.print(" "+i);
		}
	}

}
