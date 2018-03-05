package math;

public class math172 {

	public int trailingzero(int n) {
		int q5=0;
		int q2=0;
		int res=0;
			for(int i=1;i<=n;i++) {
			if(i%5==0) {
				q5++;
			}
			if(i%2==0) {
				q2++;
			}
		}
		
			if(q2>q5) {
				res=q5;
			}else {
				res=q2;
			}
		return res; 
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int m=1*2*3*4*5*6*7*8*9*10; 
		math172 a=new math172();
		int n=a.trailingzero(15);
		System.out.println(n+","+m);
	}

}
