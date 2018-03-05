package medium;

public class leetcode8 {

	public int myAtoi(String str) {
		int sign=1;
		int sum=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==' ') {
				continue;
			}else if(str.charAt(i)=='-') {
				sign=-1;
			}else if(str.charAt(i)=='+') {
				sign=1;
			}else if(Character.isDigit(str.charAt(i))){
				System.out.println(Integer.parseInt(str.substring(i,i+1)));
				
				sum+=(Integer.parseInt(str.substring(i, i+1)))*Math.pow(10, str.length()-i-1);
			}else {
			   return 0;
			}
			
		}
		
		return sign*sum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		leetcode8 a=new leetcode8();
		int q=a.myAtoi(" -1900");
		System.out.println(q);
		
	}

}
