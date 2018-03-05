package math;

import java.util.ArrayList;
import java.util.List;

public class math204 {

	public int countprime(int n) {
		List<Integer> list=new ArrayList<Integer>();
		for(int i=2;i<=n;i++) {
			for(int j=2;j<=i;j++) {
				if(i%j==0&&i!=j) {
					
					break;
				}else if(i==j) {
					list.add(j);
				}
			}
			
		}
		
		return list.size();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		math204 a=new math204();
		int q=a.countprime(13);
		System.out.println(q);
		
		
	}

}
