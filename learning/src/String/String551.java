package String;

public class String551 {

	public boolean isrecord(String s) {
	
		int a=0;
		int l=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='A') {
				a++;
			}
			if(s.charAt(i)=='L') {
				l++;
			}
			if(a==1||l==2) {
				return false;
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String551 a=new String551();
		System.out.println(a.isrecord("PAPPP"));
		
		
	}

}
