package Binarysearch;

public class Binarys367 {

	 public boolean isPerfectSquare(int num) {
	    int i=0;
	    int j=num-1;
	    
		 while(true) {
			 if(i*i==num) {
				 return true;
			 }else if(j*j==num) {
				 return true;
			 }else if(i==j) {
				 break;
			 }
			 i++;
			 j--;
		 }
		 
		 return false;
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Binarys367 a=new Binarys367();
		System.out.println(a.isPerfectSquare(16));
		
		
	}

}
