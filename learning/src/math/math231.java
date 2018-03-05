package math;

public class math231 {

	public boolean ispowertwo(int x) {
		int rep=1;
		for(int i=0;i<x;i++) {
			rep=rep*2;
			if(rep==x) {
				return true;
			}
		}
		
		return false;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		math231 a=new math231();
		System.out.println(a.ispowertwo(15));
		
	}

}
