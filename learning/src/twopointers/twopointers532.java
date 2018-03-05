package twopointers;

import java.util.ArrayList;
import java.util.List;

public class twopointers532 {

	public int kdiff(int[] m, int k) {
		List<Integer> list=new ArrayList();
		for(int i=0;i<m.length-1;i++) {
			for(int j=i+1;j<m.length;j++) {
			if(Math.abs(m[i]-m[j])==k) {
				list.add(i);
				list.add(j);
			}
			
		}
		}
		for(Integer i:list) {
			//System.out.print(i+" ");
		}
		return list.size()/2;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] m= {1,3,4,5};
		twopointers532 a=new twopointers532();
		System.out.println(a.kdiff(m, 2));
		
	}

}
