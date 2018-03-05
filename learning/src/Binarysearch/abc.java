package Binarysearch;

public class abc {
	 public int numJewelsInStones(String J, String S) {
	        int q=0;
	        for(int i=0;i<S.length()-1;i++){
	            if(J.contains(S.substring(i,i+1))){
	                q++;
	            }
	        }
	        return q;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	}

}
