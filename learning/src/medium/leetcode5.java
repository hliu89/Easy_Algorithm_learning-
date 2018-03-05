package medium;

public class leetcode5 {

	 public String longestPalindrome(String s) {
		int res=0;
		String s2="";
		 for(int i=0;i<s.length()-1;i++) {
			 for(int j=i+1;j<s.length();j++) {
				 if(isPalindrome(s,i,j)) {
					 if(j-i+1>res) {
						 res=j-i+1;
						 s2=s.substring(i, j+1);
					 }
				 }
			 }
		 }
		 
		 return s2;
	 }
	 public boolean isPalindrome(String s, int begin, int end){
	        if(begin<0) return false;
	        while(begin<end){
	        	if(s.charAt(begin++)!=s.charAt(end--)) return false;
	        }
	        return true;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		leetcode5 a=new leetcode5();
		System.out.println(a.longestPalindrome("ababaa"));
		
	}

}
