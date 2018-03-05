package String;

public class String521 {

	public int findlongest(String a,String b) {
		if(a.length()>b.length()) {
			return a.length();
		}else if(a.length()==b.length()){
			return -1;
		}else {
			return b.length();
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String521 a=new String521();
		System.out.println(a.findlongest("abcde", "abc"));
		
		
	}

}
