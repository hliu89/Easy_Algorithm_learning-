package twopointers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class twopointers350 {

	public int[] intersection2(int[] m,int[] n) {
		List<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<m.length;i++) {
			for(int j=0;j<n.length;j++) {
				if(m[i]==n[j]) {
					list.add(m[i]);
					n[j]=0;
					break;
				}
			}
		}
		int[] q=new int[list.size()];
		 Iterator<Integer> s=list.iterator();
		 int i=0;
		 while(s.hasNext()) {
			 q[i]=s.next();
			 i++;
		 }
		return q;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] m= {1,1,4,5,6,7,7,7,8};
		int[] n= {1,1,3,4,4,4,4,7,6,9,0};
		twopointers350 a=new twopointers350();
		int [] q=a.intersection2(m, n);
		for(Integer i:q) {
			System.out.print(" "+i);
		}
		
	}

}
