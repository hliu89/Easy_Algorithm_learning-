package Binarysearch;

public class Binarys441 {

public int arrangeCoins(int n) {
        int sum=0;
        int q=0;
	for(int i=0;i<n;i++) {
		for(int j=0;j<=i;j++) {
			if(j==i) {
				q++;
			}
			sum++;
			
			System.out.print("."+" ");
			if(sum==n) {
				break;
			}
			
		}
		   System.out.println("");
		   if(sum==n) {
				break;
			}
	}
	return q;
	
 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Binarys441 a=new Binarys441();
		int m=a.arrangeCoins(8);
		System.out.println(m);
		
	}

}
