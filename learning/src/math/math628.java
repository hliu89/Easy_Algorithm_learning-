package math;

import java.util.Arrays;

public class math628 {

	public int mixproduct(int[] x) {
		
		Arrays.sort(x);
		int r=Math.max(x[0]*x[1]*x[2], x[x.length-1]*x[x.length-2]*x[x.length-3]);
		return r;
	}
	public int mixproduct2(int[] x) {
		int mix=0;
		for(int i=0;i<x.length;i++) {
			for(int j=0;j<x.length;j++) {
				for(int k=0;k<x.length;k++) {
					if(x[i]*x[j]*x[k]>mix&&i!=j&&j!=k&&i!=k) {
						mix=x[i]*x[j]*x[k];
					}
				}
			}
		}
		
		
		return mix;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] x= {1,2,3,4,5,0};
		math628 a=new math628();
		int q=a.mixproduct2(x);
		System.out.print(q);
	}

}
