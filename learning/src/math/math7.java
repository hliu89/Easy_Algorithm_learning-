package math;

import java.util.ArrayList;
import java.util.List;

public class math7 {

	public int reverse(int m) {
		int n=0;
		int q=m;
		List<Integer> list=new ArrayList();
		for(int i=1;i<q;i=i*10) {
			list.add(m%10);
			System.out.print(m%10+",");
			m=(m-m%10)/10;
			
		}
		for(int i=list.size()-1;i>=0;i--) {
		n=(int) (n+list.get(i)*Math.pow(10, i));
		
		}
		return n;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		math7 m=new math7();
		int q=m.reverse(1235);
		System.out.print(q);
		
	}

}
