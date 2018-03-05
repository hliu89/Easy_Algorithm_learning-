package math;

import java.util.HashSet;
import java.util.Set;

public class math645 {

	public int[] findnum(int[] x) {
		Set s=new HashSet();
		int[] m=new int[2];
	    for(int i=0;i<x.length;i++) {
			if(s.add(x[i])==false) {
				m[0]=i+1;
				m[1]=x[i];
			}
		}
		
		return m;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] x= {1,2,3,4,5,6,6,8};
		math645 a=new math645();
		int[] q=a.findnum(x);
		for(int i=0;i<q.length;i++) {
			System.out.print(q[i]);
		}
		
	}

}
