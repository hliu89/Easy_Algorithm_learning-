package math;

public class math258 {

	public int onlyonedigit(int x) {
		

		while(x>=10) {
          int s=0;
		while(x/10>0) {
			s=x%10+s;
			x/=10;
		}
		s=x+s;
		x=s;
		}
		return x;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		math258 a=new math258();
		System.out.println(a.onlyonedigit(95));
		
	}

}
