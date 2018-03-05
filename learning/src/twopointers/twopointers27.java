package twopointers;

import java.util.ArrayList;
import java.util.List;

public class twopointers27 {

	public int valremove(int v,int[] x) {
	
		List<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<x.length;i++) {
			list.add(x[i]);
//			if(x[i]==v) {
//				list.remove(i);
//			}
		}
		for(int i=0;i<list.size();i++) {
			if(list.get(i)==v) {
				list.remove(i);
			}
		}
		for(Integer i:list) {
			System.out.print(" "+i);
		}
		
		return list.size();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] x= {1,2,3,4,2,5};
		twopointers27 a=new twopointers27();
		int q=a.valremove(2, x);
		System.out.println(" "+q);
		
	}

}
