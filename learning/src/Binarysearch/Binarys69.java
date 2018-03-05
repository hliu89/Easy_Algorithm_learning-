package Binarysearch;

public class Binarys69 {

	 public int mySqrt(int x) {
	     int res=0;
		 for(int i=0;i<x;i++) {
			 if(i*i==x) {
				 res=i;
			 }else if(i*i<x&&(i+1)*(i+1)>x) {
				 res=i;
			 }
		 }
		 
		 return res;
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Binarys69 a=new Binarys69();
		System.out.println(a.mySqrt(19));
		
	}

}
