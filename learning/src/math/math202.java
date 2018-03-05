package math;

import java.util.HashSet;
import java.util.Set;

public class math202 {

	public boolean ishappy(int x) {
		Set<Integer> s=new HashSet<Integer>();
		while(s.add(x)) {
			int sum=0;
		while(x>0) {
			
			int q=x%10;
		    sum=sum+q*q;
			x=x/10;
			
		}
		if(sum==1) {
			return true;

		}else {
		    x=sum;
		  }

		}
		return false;
			}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		math202 a=new math202();
		Boolean x=a.ishappy(19);
		System.out.print(x);
		
	}

}
