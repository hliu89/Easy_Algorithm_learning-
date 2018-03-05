package Binarysearch;

public class Binarys374 {

	public int guess(int m) {
		int n=10;
		if(m==n) {
		 return 0;
		}else if(m>n) {
			return 1;
		}else {
			return -1;
		}
		
	}
	
	 public int guessNumber(int n) {
	     int low=1;
	     int height=n;
	     while(low<height) {
	    	 int mid=low+(height-low)/2;
	    	 if(guess(mid)==0) {
	    		 return mid;
	    	 }else if(guess(mid)==1){
	    		 low=mid+1;
	    	 }else{
	    		 height++;
	    	 }
	     }
		 
		 
		 return low;
	    }
	 public int guessNumber2(int n) {
		    int i = 1, j = n;
		    while(i < j) {
		        int mid = i + (j - i) / 2;
		        if(guess(mid) == 0) {
		            return mid;
		        } else if(guess(mid) == 1) {
		            i = mid + 1;
		        } else {
		            j = mid;
		        }
		    }
		    return i;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Binarys374 a=new Binarys374();
		System.out.println(a.guessNumber(7));
		
	}

}
