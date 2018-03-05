package math;

public class math268 {

	public int missingnum(int [] n) {
		int res=0;
		for(int i=0;i<=n.length;i++) {
			if(n[i]!=i) {
				res=i;
				break;
			}
		}
		
		return res;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] n= {0,1,2,3,4,5,7,8,9};
		math268 a=new math268();
		System.out.println(a.missingnum(n));
		
	}

}
