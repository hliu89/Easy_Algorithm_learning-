package math;

public class math367 {

	public boolean perfectsquare(int x) {
		
		for(int i=0;i<x/2;i++) {
			if(i*i==x) {
				return true;
			}
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		math367 a=new math367();
		System.out.println(a.perfectsquare(80));
		
	}

}
