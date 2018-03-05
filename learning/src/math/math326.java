package math;

public class math326 {

	public boolean ispowerofthree(int x) {
		int rep=1;
		for(int i=0;i<x;i++) {
			rep=rep*3;
			if(rep==x) {
				return true;
			}
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		math326 a=new math326();
		System.out.println(a.ispowerofthree(27));
		
	}

}
