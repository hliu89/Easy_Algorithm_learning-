package math;

public class math441 {

	public int coins(int x) {
		int l=0;
		int q=0;
		for(int i=1;i<=x;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" "+".");
				if(j==i) {
				l++;	
				}
				q++;
				if(q==x) {
					break;
				}
			}
			if(q==x) {
				break;
			}
			System.out.println();
		}
		
		return l;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		math441 a=new math441();
		int b=a.coins(10);
		System.out.print("answer "+b);
	}

}
