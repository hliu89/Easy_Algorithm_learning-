package math;

public class math9 {

	public boolean around(int[] m) {
		
		for(int i=0;i<m.length;i++) {
			if(m[i]!=m[m.length-1-(i)]) {
				return false;
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] m= {1,2,3,4,4,2,1};
		
		math9 a=new math9();
		System.out.println(a.around(m));
		
	}

}
