package math;

public class math400 {

	public int findnth(int n) {
		int r=0;
			for(int i=0;i<=n;i++){
				while(true) {
					int q=i;
					q=q/10;
					r=r+1;
					if(q/10==0) {
						break;
					}
				}
				
			}	
		
		return r;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		math400 a=new math400();
		System.out.print(a.findnth(11));
		
	}

}
