package math;

public class math263 {

	public boolean isuglynum(int x) {
		
		while(x%2==0) {
			x=x/2;
		}
		while(x%3==0) {
			x=x/3;
		}
		while(x%5==0) {
			x=x/5;
		}
		if(x==1) {
			return true;
		}else {
		return false;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		math263 a=new math263();
		System.out.print(a.isuglynum(125));
		
	}

}
