package Binarysearch;

public class Binarysearch167 {

	public int[] twosum(int[] x,int target) {
		int[] m=new int[2];
		for(int i=0;i<x.length;i++) {
			for(int j=i;j<x.length;j++) {
				if(x[i]+x[j]==target) {
					m[0]=i;
					m[1]=j;
					break;
				}
			}
		}
		
		return m;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] x= {1,2,4,6,7,8};
		Binarysearch167 a=new Binarysearch167();
		int[] q=a.twosum(x, 10);
		for(Integer i:q) {
			System.out.println(i);
		}
		
	}

}
