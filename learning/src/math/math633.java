package math;

public class math633 {

	public boolean judgesquare(int x) {
		
		for(int i=0;i<x;i++) {
			for(int j=0;j<x;j++) {
				if(i*i+j*j==x) {
					return true;
				}
			}
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		math633 a=new math633();
		boolean s=a.judgesquare(6);
		System.out.println(s);
	}

}
