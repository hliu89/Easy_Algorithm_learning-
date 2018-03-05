package linkedlist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class linkedlist21 {

	public List<Integer> merge(int[] m,int[] n) {
		List<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<m.length;i++) {
			list.add(m[i]);
		}
		for(int i=0;i<n.length;i++) {
			list.add(n[i]);
		}
		Collections.sort(list);
		return list;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] m= {1,2,3,4,5,8,19};
		int[] n= {11,12,15,17,18};
		linkedlist21 a=new linkedlist21();
		List<Integer> q=a.merge(m, n);
		for(int i:q) {
			System.out.print(i+",");
		}
	}

}
